<%@include file='header.jsp'%>
	</header>
	<section class="tenders wrapper940 clear">
		<div class="pop_tenders">Ваш тендер</div>
		<div class="card_tender shadow_style clear">
			<div class="tender_name mg_left_30">Название тендера</div>
			<div class="batton_edit">редактировать</div>
			<div class="status_bar mg_left_30 clear">
				<div class="tender_status"><span>Статус:</span>
					 Выполняется
				</div>
				<div class="tender_type"><span>Категория:</span>
					Строительство
				</div>
				<div class="tender_cost"><span>Бюджет:</span>
					999 999 999 руб.
				</div>
				<div class="tender_start"><span>Срок:</span>
					25.05.2015 18:00
				</div>
			</div>
			<div class="tender_details mg_left_30">
				<div class="tender_address clear">
					<span>Адрес:</span>
					<span>г. Москва ул. Сосновая 13</span>
				</div>
				<div class="tender_deckription clear">
					<span>Описание:</span>
					<span>
						Здесь произвольный текст произвольный текст произвольный текст 
						произвольный текст 
					</span>
				</div>
				<div class="clear">
					<span>Когда:</span>
					<span>26 12 2015</span>
				</div>
			</div>
			<img src="./images/picture/image3.jpg" alt="image3">
		</div>
		<div class="tenders_list_box shadow_style">
			<div class="top_bar clear">
				<div class="proposals mg_left_30">Предложения поставщиков</div>
				<ul id="Tab" class="nav nav-tabs clear">
					<li>
						<a href="#list" class="tab1" data-toggle="tab">Списком</a>
					</li>
					<li class="active">
						<a href="#map" class="tab2" data-toggle="tab">На карте</a>
					</li>
			    </ul>
			</div>
		    <div id="TabContent" class="tab-content">
				<div class="tab-pane fade in active" id="map">
					<div class="map_box">
						<div id="map_canvas" class="map"></div>
						<div class="company details_info line_bottom clear">
							<div class="left_info">
								<div class="name_company">Компания №4</div>
								<div class="reviewStars clear">
								    <input id="star-4" type="radio" name="reviewStars42" disabled="">
								    <label title="gorgeous" for="star-4"></label>

								    <input id="star-3" type="radio" name="reviewStars42" disabled="">
								    <label title="good" for="star-3"></label>

								    <input id="star-2" type="radio" name="reviewStars42" disabled="">
								    <label title="regular" for="star-2"></label>

								    <input id="star-1" type="radio" name="reviewStars42" disabled="">
								    <label title="poor" for="star-1"></label>

								    <input id="star-0" type="radio" name="reviewStars42" checked="" disabled="">
								    <label title="bad" for="star-0"></label>							    
								</div>
								<span class="details down">кратко</span>
								<div class="period"><span>Сроки: </span>229 дней</div>
								<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
								<div class="description">Описание выполнения</div>
								<div class="description_text">
									Здесь произвольный текст произвольный текст произвольный текст 
									произвольный текст произвольный текст 
									произвольный текст
								</div>
								<div class="urgently urgently_text" data-title="уникальное предложение">
									<span>Уникальное предложение</span>
									<img src="./images/urgently2_ico.png" alt="urgently_ico">
								</div>
								<div class="description_text">
									Здесь произвольный текст произвольный текст произвольный текст 
									произвольный текст произвольный текст 
									произвольный текст
								</div>
							</div>
							<div class="right_info">
								<div class="tender_close"></div>
								<div>Файлы</div>
								<div class="dounload_img">
									<img src="./images/picture/image4.jpg" alt="image4">
									<div><a href="#">image.jpg</a></div>
								</div>
								<div><a href="#">смета.xls</a></div>
								<div><a href="#">презентация.pdf</a></div>
								<div class="info_button button_active1 shadow_style">Выбрать</div>
							</div>
						</div>
					</div>
				</div>
				<div class="tab-pane fade" id="list">
					<div class="sort_box line_bottom clear">
						<div class="name_company">Название компании</div>
						<div class="period">Сроки</div>
						<div class="tender_price sorting_top">Цена</div>
						<div class="urgently"><img src="./images/urgently_ico.png" alt="urgently_ico"></div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №1</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars1" checked disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars1" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars1" disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars1" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars1" disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="urgently urgently_text" data-title="уникальное предложение">
								<span>Уникальное предложение</span>
								<img src="./images/urgently2_ico.png" alt="urgently_ico">
							</div>

							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №2</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars2" disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars2" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars2" checked disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars2" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars2"  disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №3</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars3" checked="" disabled="">
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars3" disabled="">
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars3" disabled="">
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars3" disabled="">
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars3" disabled="">
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company details_info line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №4</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars4" disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars4" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars4" disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars4" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars4" checked disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details down">кратко</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="urgently urgently_text" data-title="уникальное предложение">
								<span>Уникальное предложение</span>
								<img src="./images/urgently2_ico.png" alt="urgently_ico">
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №5</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars5" disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars5" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars5" disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars5" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars5" checked disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №6</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars6" checked disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars6" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars6" disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars6" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars6"  disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="urgently urgently_text" data-title="уникальное предложение">
								<span>Уникальное предложение</span>
								<img src="./images/urgently2_ico.png" alt="urgently_ico">
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="company line_bottom clear">
						<div class="left_info">
							<div class="name_company">Компания №7</div>
							<div class="reviewStars clear">
							    <input id="star-4" type="radio" name="reviewStars3" disabled/>
							    <label title="gorgeous" for="star-4"></label>

							    <input id="star-3" type="radio" name="reviewStars3" disabled/>
							    <label title="good" for="star-3"></label>

							    <input id="star-2" type="radio" name="reviewStars3" disabled/>
							    <label title="regular" for="star-2"></label>

							    <input id="star-1" type="radio" name="reviewStars3" disabled/>
							    <label title="poor" for="star-1"></label>

							    <input id="star-0" type="radio" name="reviewStars3" checked disabled/>
							    <label title="bad" for="star-0"></label>							    
							</div>
							<span class="details">подробно</span>
							<div class="period"><span>Сроки: </span>229 дней</div>
							<div class="tender_price"><span>Цена: </span>999 999 999 руб.</div>
							<div class="description">Описание выполнения</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
							<div class="description_text">
								Здесь произвольный текст произвольный текст произвольный текст 
								произвольный текст произвольный текст 
								произвольный текст
							</div>
						</div>
						<div class="right_info">
							<div class="tender_close"></div>
							<div>Файлы</div>
							<div class="dounload_img">
								<img src="./images/picture/image4.jpg" alt="image4">
								<div><a href="#">image.jpg</a></div>
							</div>
							<div><a href="#">смета.xls</a></div>
							<div><a href="#">презентация.pdf</a></div>
							<div class="info_button button_active1 shadow_style">Выбрать</div>
						</div>
					</div>
					<div class="list_footer clear">
						<div class="all_list tender_button button_active2 shadow_style">Скрыть все предложения</div>
						<ul class="pagination clear">
							<li><a href="#" class="a_active">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">6</a></li>
							<li><a href="#">7</a></li>
							<li><a href="#">8</a></li>
						</ul>
					</div>
				</div>
			</div>
	    </div>
	    <div class="comments_box shadow_style clear">
	    	<div class="line_bottom">
	    		<div class="proposals mg_left_30">Комментарии к тендеру</div>
	    		<div class="checked message">
					<input id="check1" type="checkbox">
					<label for="check1" class="check_agree">Уведомлять о комментариях к тендеру по эл. почте</label>
				</div>
	    	</div>
	    	<div class="hint_box line_bottom">
	    		Здесь произвольный текст. Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four sartorial PBR leggings next level wes anderson
	    	</div>
	    	<div class="comments line_bottom">
	    		<div class="comments_top clear mg_left_30">
	    			<div class="comments_title">Заказчик</div>
	    			<div class="comments_time">20 минут назад</div>
	    			<div class="select_wrapper">
		    			<select>
		    				<option>вся переписка (3 сообщения)</option>
		    				<option>сообщение</option>
		    			</select>
	    			</div>
	    		</div>
	    		<div class="comment mg_left_30">
    				blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk leggings next level wes anderson artisan four loko farm-to-table 
    			</div>
    			<div class="reply">ответить</div>
    			<div class="all_list tender_button button_active2 shadow_style">Добавить новый комментарий</div>
	    	</div>
	    </div>
	</section>

	<div class="overlay"></div>
	<form id="endTender" class="modal_box_big modal">
		<div class="modal_close"></div>
		<div class="modal_title">Завершение тендера</div>
		<div class="modal_text">Укажите выполнен ли тендер</div>
		<div class="radio_box clear">
			<div class="good_end">
				<input id="good" type="radio" name="end_tender" checked="">
				<label for="good">Тендер выполнен</label>
				<div></div>
			</div>
			<div class="bad_end">
				<input id="bad" type="radio" name="end_tender">
				<label for="bad">Тендер не выполнен</label>
			</div>
		</div>
		<div class="modal_text">Оцените исполнителя</div>
		<div class="review_box clear">
			<div>плохо</div>
			<div class="reviewStars clear">
				
			    <input id="star-4" type="radio" name="reviewStars"/>
			    <label title="gorgeous" for="star-4"></label>

			    <input id="star-3" type="radio" name="reviewStars"/>
			    <label title="good" for="star-3"></label>

			    <input id="star-2" type="radio" name="reviewStars"/>
			    <label title="regular" for="star-2"></label>

			    <input id="star-1" type="radio" name="reviewStars"/>
			    <label title="poor" for="star-1"></label>

			    <input id="star-0" type="radio" name="reviewStars"/>
			    <label title="bad" for="star-0"></label>
			</div>
			<div>хорошо</div>
		</div>
		<a href="#" class="info_button button_active1 shadow_style">Перейти</a>
		<?php include('pluso.php'); ?>
	</form>
	<div id="notMoney" class="modal_box_big modal_money modal">
		<div class="modal_close"></div>
		<div class="modal_title">На вашем счете<br>недостаточно средств</div>
		<div class="text_grey">
			Вы не можете оставлять предложения<br>пока не пополните счет
		</div>
		<a href="#" class="info_button button_active1 shadow_style">Перейти</a>
	</div>
	<div class="modal_box_big modal">
		<div class="modal_close"></div>
		<div class="modal_title">Поздравляем!</div>
		<div class="choiced">Вы выбрали поставщика!</div>
		<div class="modal_text">
			Теперь вы можете перейти на страницу выбранного поставщика<br>
			и начать вести преговоры по тендеру
		</div>
		<div class="modal_text">
			Перейти на страницу поставщика<br>для связи
		</div>
		<a href="#" class="info_button button_active1 shadow_style">Перейти</a>
		<%@include file='pluso.jsp'%>
	</div>
<%@include file='footer.jsp'%>