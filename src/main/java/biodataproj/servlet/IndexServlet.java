package biodataproj.servlet;

import biodataproj.config.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

	

	public class IndexServlet extends
			AbstractAnnotationConfigDispatcherServletInitializer {

		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] { SpringRootConfig.class };
		}

		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] { SpringWebConfig.class };
		}

		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		}

	}

