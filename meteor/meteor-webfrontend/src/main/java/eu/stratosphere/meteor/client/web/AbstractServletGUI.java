package eu.stratosphere.meteor.client.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The abstract servlet for each frame servlet. Build up the html body for each frame.
 * 
 */
public abstract class AbstractServletGUI extends HttpServlet {

	/**
	 * Generated UID and title of frame
	 */
	private static final long serialVersionUID = -8142279843935070159L;

	private final String title;

	/**
	 * Javascripts and CSS files
	 */
	private boolean jQueryLibs = false;

	private final List<String> javaScripts;

	private final List<String> stylesheets;

	/**
	 * Construct a new servlet with given title.
	 * 
	 * @param title
	 */
	public AbstractServletGUI(final String title) {
		this.title = title;
		this.javaScripts = new ArrayList<String>();
		this.stylesheets = new ArrayList<String>();
	}

	/**
	 * Add a javascript file from folder resources/web-doc/js/ with given name
	 * 
	 * @param name
	 *        of js file
	 */
	public void addJavaScript(final String name) {
		if (name.equals("jQueryLibaries")) {
			this.jQueryLibs = true;
			this.javaScripts.add("js/convert.js");
		} else
			this.javaScripts.add("js/" + name);
	}

	/**
	 * Add a stylesheet css file from folder resources/web-doc/css/ with given name
	 * 
	 * @param name
	 *        of css file
	 */
	public void addStylesheet(final String name) {
		this.stylesheets.add("css/" + name);
	}

	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException,
			IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);

		final PrintWriter writer = response.getWriter();

		writer.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		writer.println("<html>");

		writer.println("<head>");
		writer.println("  <title>" + this.title + "</title>");
		writer.println("  <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\"/>");

		// javascripts
		if (this.jQueryLibs)
			this.addJQueryLibaries(writer); // write all online java scripts for jQuery
		for (int i = 0; i < this.javaScripts.size(); i++)
			writer.println("  <script type=\"text/javascript\" src=\"" + this.javaScripts.get(i) + "\"></script>");

		// stylesheets
		for (int i = 0; i < this.stylesheets.size(); i++)
			writer.println("  <link rel=\"stylesheet\" media=\"screen\" href=\"" + this.stylesheets.get(i) + "\">");

		writer.println("</head>");
		writer.println("<body>");

		// print body
		this.writePage(writer);

		// print footer
		writer.println("</body>");
		writer.println("</html>");
	}

	/**
	 * Add all online java scripts for jQuery
	 * 
	 * @param writer
	 */
	private void addJQueryLibaries(final PrintWriter writer) {
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/misc/jquery.js?v=1.4.4\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/misc/jquery.once.js?v=1.2\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/misc/ui/jquery.ui.core.min.js?v=1.8.7\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/misc/jquery.ba-bbq.js?v=1.2.1\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/misc/jquery.cookie.js?v=1.0\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dygraphs.com/dygraph-combined.js\"></script>");
		writer.println("  <script type=\"text/javascript\" src=\"http://dopa.dima.tu-berlin.de/sites/all/themes/omega/omega/js/jquery.formalize.js?mbf7jy\"></script>");
	}

	/**
	 * Write the body of html frame
	 * 
	 * @param writer
	 */
	protected abstract void writePage(PrintWriter writer);
}
