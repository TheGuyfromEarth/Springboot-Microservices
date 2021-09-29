package dept;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@GetMapping("/{uniId}")
	public Department getDept(@PathVariable("uniId") String uniId) {
		return new Department("1201","CSE","Uni101");
	}

}
