package learing.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import learing.springboot.domain.MyException;

@Controller
public class HelloWebController {

	/**
	 * 测试hello
	 * 
	 * @return
	 */
	@RequestMapping(value = "/hello/someone", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name", "Dear");
		return "/hello/someone";
	}

	@RequestMapping("/")
	public String index(ModelMap map) {
		// 加入一个属性，用来在模板中读取
		map.addAttribute("host", "http://blog.didispace.com");
		map.addAttribute("name", "Dear");
		// return模板文件的名称，对应src/main/resources/templates/index.html
		return "index";
	}

	@RequestMapping("/test_error")
	public String testError(ModelMap map) throws Exception {
		throw new Exception("发生一个测试错误");
	}
    @RequestMapping("/test_error_json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
