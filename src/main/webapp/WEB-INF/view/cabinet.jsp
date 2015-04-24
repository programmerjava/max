<!doctype html>
<html>
<head>
    <%@ include file="head.jsp"%>
</head>
<body>
	<div class="overlay"></div>
	<%@ include file="header.jsp"%>
	<div class="wrapper">
		<div class="pop_tenders">Личный кабинет</div>
		<aside>
			<ul class="shadow_style">
				<li>
					<a href="">Мои тендеры (5)</a>
					<ul>
						<li><a href="">Актуальные (3)</a></li>
						<li><a href="">Завершенные (2)</a></li>
						<li class="disabl"><a href="">Неудачные (0)</a></li>
					</ul>
				</li>
				<li class="select"><a href="">Настройки</a></li>
				<li><a href="">Счет</a></li>
			</ul>
		</aside>
		<section class="right clear profile">
			<fieldset class="shadow_style">
				<h2>Личная информация</h2>
				<div class="profile_block">
					<div class="left_profile">
						<ul class="info_profile">
							<li>Название компании: ООО «Рога и копыта»</li>
							<li>Контактное лицо: Иванов Петр Сергеевич</li>
							<li>ОГРН: 99 99 99 99 99 991 <a href="" class="upload">свидетельство</a></li>
							<li>ИНН: 99 99 99 99 91</li>
						</ul>
						<ul class="contact_profile">
							<li><span>Телефон:</span><span>+7 (495) 555 55 55</span></li>
							<li><span>Почта: </span><span>ivanov.petr@mail.ru</span></li>
							<li><a href="" class="edit">редактировать</a></li>
						</ul>
					</div>
					<div class="right_profile">
						<div class="title">Логотип компании</div>
						<img src="images/avatar.png">
						<a href="" class="upload">загрузить</a>
					</div>
					<div class="clear"></div>
				</div>
				<div class="password">
					<div class="title">Изменить пароль для входа</div>
					<div class="row">
						<label>Старый пароль:</label>
						<input type="password">
					</div>
					<div class="row new">
						<label>Новый пароль: </label>
						<input type="password">
					</div>
					<input type="submit" class="button_active1 shadow_style btn-green" value="Сохранить">
				</div>
				<div class="category">
					<div class="title">Выбрать категорию участия</div>
					<div class="row">
						<select class="search">
							<option>Категория 1</option>
							<option selected="">подкатегория 1.2</option>
							<option>- подкатегория 1.2</option>
							<option>-- под-подкатегория 1.2.1</option>
							<option>Категория 2</option>
							<option>- подкатегория 2.2</option>
							<option>-- под-подкатегория 2.2.1</option>
							<option>Категория 3</option>
							<option>- подкатегория 3.2</option>
							<option>-- под-подкатегория 3.2.1</option>
						</select>
					</div>
					<div class="row">
						<a class="add_category" href="#">добавить категорию</a>
					</div>
				</div>
			</fieldset>
			<div class="clear"></div>
			<br><br>
			<fieldset class="shadow_style">
				<h2 class="text_gray">Галерея работ</h2>
				<div class="gallery">
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
					<div class="item">
						<img src="./images/picture/img.png" alt="image1">
						<div>
							<div class="title">Название работы</div>
							<div class="anons">Это было сложно, но мы это сделали...</div>
							<a class="btn-link">Подробнее</a>
						</div>
					</div>
				</div>
				<div class="title_gray">Добавить новую работу</div>
				<div class="add_work">
					<div class="left_block">
						<div class="row">
							<label>Название:</label>
							<input type="text" class="text_gray">
						</div>
						<div class="row green">
							<label>Описание:</label>
							<input type="text">
						</div>
					</div>
					<div class="right_block">
						<img src="images/picture/img2.png">
						<a href="" class="upload">загрузить</a>
						<input type="submit" class="button_active1 shadow_style btn-green" value="Добавить">
					</div>
					<div class="clear"></div>
				</div>
			</fieldset>
			<br><br>
			<fieldset class="shadow_style setting_message">
				<h2 class="text_gray">Настройки уведомлений</h2>
				<div class="checked">
					<input id="check1" type="checkbox">
					<label for="check1" class="text_gray">Уведомлять меня о сообщениях заказчиков</label>
				</div>
				<div class="checked">
					<input id="check2" type="checkbox">
					<label for="check2" class="text_gray">Уведомлять меня о снижении цен</label>
				</div>
			</fieldset>
		</section>
		<div class="clear"></div>
	</div>
	<%@include file="footer.jsp"%>
</body>