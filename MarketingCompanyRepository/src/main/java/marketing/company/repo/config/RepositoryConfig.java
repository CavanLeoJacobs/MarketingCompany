package marketing.company.repo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "marketing.company.repo.controller",
        "marketing.company.repo.exceptions",
        "marketing.company.repo.persistence"})
public class RepositoryConfig
{

  // countable noun.
    // The config of a computer system is the way in which all its parts,
    // such as the hardware and software, are connected together in order for the computer to work.
    // Config is short for ' configuration'.

}
