package tenders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tenders.beans.Balance;
import tenders.services.repository.BalanceRepository;

@RequestMapping("/balance")
@Controller
public class BalanceController {

	@Autowired
	BalanceRepository balances;

	/**
	 * 
	 * @param userId
	 *            -- если не указан, то используется идентификатор пользователя
	 *            в сессии; если указан и пользователь, выполняющий это действие
	 *            не является модератором, то сервер должен запретить доступ.
	 * @return
	 */
	@RequestMapping("/get")
	@ResponseBody
	public Balance get(
			@RequestParam(required = false, value = "user_login") String login) {

		if (login == null) {
			login = SecurityContextHolder.getContext().getAuthentication()
					.getName();
		}
		return balances.findOneByUserLogin(login);
	}

	
	
}
