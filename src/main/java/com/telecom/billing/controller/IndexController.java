/**
 * 
 */
package com.telecom.billing.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.telecom.billing.model.User;

/**
 * @author zhangle
 *
 */
@Controller
//@SessionAttributes({ "user" })
public class IndexController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(Locale locale, ModelMap map) {

		// Date date = new Date();
		// DateFormat dateFormat =
		// DateFormat.getDateTimeInstance(DateFormat.LONG,
		// DateFormat.LONG, locale);
		//
		// String formattedDate = dateFormat.format(date);
		//
		// if (!map.containsAttribute("user")) {
		// User newUser = new User();
		// newUser.setRole("default");
		// // newUser.setRole("default");
		// map.addAttribute("user", newUser);
		// }
		//
		// // request.getSession().setAttribute("role", "admin");
		// map.addAttribute("serverTime", formattedDate);

		return "admin/form";
	}
}