package movietickets.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class MovieMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions(
                "/WEB-INF/views/tiles.xml",
                "/WEB-INF/views/admin/tiles.xml",
                "/WEB-INF/views/accounts/tiles.xml");
        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver viewResolver = new TilesViewResolver();
        // This allows access to ${requestContext.theme.name} from a Tiles view
        viewResolver.setRequestContextAttribute("requestContext");
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
        return viewResolver;
    }
}

