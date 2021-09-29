package uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/uni")
public class UniversityController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{uniId}")
	public University getUniDetails(@PathVariable("uniId") String uniId) {
		
		// get request to fetch dept from Dept microservice
		Department dept = restTemplate.getForObject("http://dept-service/dept/Uni101", Department.class);
		
		return new University("Uni101","New Heights University","private",dept);
	}
	
}
