
<!doctype html>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
	<div class="overlay"></div>
	<%@include file="header.jsp"%>
	<section class="request">
		<div class="pop_tenders">Заполните заявку</div>
		<form class="wrapper790" method="POST" action="submit_tender">
			<div class="search_category">Укажите раздел:</div>
			<select id="list-search" class="search">
				<option selected="">Все категории</option>
				<option>Категория 1</option>
				<option>- подкатегория 1.2</option>
				<option>-- под-подкатегория 1.2.1</option>
				<option>Категория 2</option>
				<option>- подкатегория 2.2</option>
				<option>-- под-подкатегория 2.2.1</option>
				<option>Категория 3</option>
				<option>- подкатегория 3.2</option>
				<option>-- под-подкатегория 3.2.1</option>
			</select>
			<div class="clearfix"></div>
			<input type="text" class="tender_title top_placeholder" placeholder="Заголовок для тендера" data-placeholder="Заголовок для тендера" data-type="title_for_tender" data-top="62-20" data-font-size="24-18" data-font-color="000-999">
			<input type="text" class="tender_title top_placeholder" placeholder="Подробное описание тендера" data-placeholder="Подробное описание тендера" data-type="descr_tender" data-top="62-10" data-font-size="24-18" data-font-color="999-55b716">
			<div class="add_foto">
				Добавить фотографию / техническое задание
				<span></span>
				<div class="info">
					<div class="cls"></div>
					<div class="title">Техническое задание это</div>
					<div class="body">Таким образом рамки и место обучения кадров в значительной степени обуславливает создание модели развития. Не следует, однако забывать, что начало повседневной работы по формированию позиции играет важную роль в формировании новых предложений. </div>
				</div>
			</div>

			<div class="file">
				<ul>
					<li class="load">
						<input type="file" id="file1">
						<label for="file1">добавить файл</label>
						<span></span>
					</li>
				</ul>
			</div>
			
			<div class="clearfix"></div>
			<input type="text" class="tender_title tender_place top_placeholder" placeholder="Адрес или желаемое место выполнения" data-placeholder="Адрес или желаемое место выполнения" data-type="tender_place" data-top="62-20" data-font-size="24-18" data-font-color="000-999">
			<div class="search_category">Укажите округ (если Москва)</div>
			<select id="list-region" class="search">
				<option selected="">Выбрать округ</option>
				<option>Центральный</option>
				<option>Северный</option>
				<option>Северо-Восточный</option>
				<option>Восточный</option>
				<option>Юго-Восточный</option>
				<option>Южный</option>
				<option>Юго-Западный</option>
				<option>Западный</option>
				<option>Северо-Западный</option>
				<option>Зеленоградский</option>
				<option>Троицкий</option>
				<option>Новомосковский</option>
			</select>
			<div class="total_time">Дата и время актуальности тендера</div>
			<label class="tender_date">Дата:
				<input type="text" placeholder="введите дату">
			</label>
			<label class="tender_date_time">Время:
				<input type="text" placeholder="введите время">
			</label>
			<div class="payment">Оплата</div>
			<label class="payment_text">Я готов/готова заплатить за работу
				<input type="text" placeholder="введите сумму">
				руб.
			</label>
			<br>
			<div class="checked">
				<input id="check1" type="checkbox">
				<label for="check1" class="check_agree">Я согласен с <a href="#">правилами сервиса</a></label>
			</div>
			<input id="btnReg" type="submit" class="info_button button_active1 shadow_style" value="Опубликовать тендер">
		</form>
	</section>
	<div class="overlay"></div>
	<div id="modalReg" class="modal_box_big modal">
		<div class="modal_close"></div>
		<div class="modal_title">Поздравляем!</div>
		<div class="choiced">Ваш тендер зарегистрирован!</div>
		<div class="modal_text">
			Наши специалисты в ближайшее время рассмотрят заявку<br>
			и свяжутся с Вами для уточнения деталей.<br>
			Узнать подробней как это работает <a href="">здесь.</a>
		</div>
		<div class="next_step clear">
			<div class="next_step_left">
				<div>А пока вы можете<br>посмотреть свой тендер</div>
				<a href="#" class="info_button button_active1 shadow_style">Посмотреть тендер</a>
			</div>
			<div class="next_step_right">
				<div>Перейти в личный кабинет</div>
				<a href="#" class="info_button button_active1 shadow_style">Личный кабинет</a>
			</div>
			<div class="or_box"></div>
		</div>
		<%@include file="pluso.jsp"%>
	</div>
	<%@include file="footer.jsp"%>
</body>