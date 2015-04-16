package tenders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tenders.services.repository.BalanceLogRepository;
import tenders.services.repository.BalanceRepository;



@RequestMapping("/balance")
@Controller
public class BalanceController {

	
	@Autowired BalanceLogRepository logRepository;
	
	@Autowired BalanceRepository balanceRepository;
	
	
	
	
	/**
	 * 
	 * @param userId -- если не указан, то используется идентификатор пользователя в сессии;
	 * если указан и пользователь, выполняющий это действие не является модератором, 
	 * то сервер должен запретить доступ.
	 * @return
	 */
	@RequestMapping("/get_balance")
	@ResponseBody
	public String get(@RequestParam("userId") String userId) {
		throw new UnsupportedOperationException();
	}
	
	
	/**
	 * 
	 * @param userId -- если не указан, то используется идентификатор пользователя в сессии;
	 * если указан и пользователь, выполняющий это действие не является модератором, 
	 * то сервер должен запретить доступ.
	 * @return
	 */
	@RequestMapping("/get_balance_log")
	@ResponseBody
	public String getLog(@RequestParam("userId") String userId) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	
	
	
}
