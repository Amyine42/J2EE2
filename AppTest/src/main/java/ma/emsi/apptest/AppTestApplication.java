package ma.emsi.apptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AppTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppTestApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "home";
	}

	@GetMapping("/secured/hello")
	public String hello(@AuthenticationPrincipal Saml2AuthenticatedPrincipal principal, Model model) {
		model.addAttribute("name", principal.getName());
		model.addAttribute("number", principal.getAttribute("matricule"));
		return "hello";
	}

}
