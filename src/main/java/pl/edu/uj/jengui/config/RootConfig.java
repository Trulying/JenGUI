package pl.edu.uj.jengui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({pl.edu.uj.jengui.config.WebConfig.class,
        pl.edu.uj.jengui.config.SecurityConfig.class})
public class RootConfig {
}
