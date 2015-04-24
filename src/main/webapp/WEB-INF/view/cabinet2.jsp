<!doctype html>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
	<div class="overlay"></div>
	<%@include file="header.jsp"%>
	<div class="wrapper">
		<div class="pop_tenders">Личный кабинет</div>
		<aside>
			<ul class="shadow_style">
				<li>
					<a href="">Мои тендеры (5)</a>
					<ul>
						<li class="select"><a href="">Актуальные (3)</a></li>
						<li><a href="">Завершенные (2)</a></li>
						<li class="disabl"><a href="">Неудачные (0)</a></li>
					</ul>
				</li>
				<li><a href="">Настройки</a></li>
				<li><a href="">Счет</a></li>
			</ul>

			<a class="info_button button_active1 shadow_style btn_green">Добавить новый тендер</a>
		</aside>
		<section class="right clear profile">
			<fieldset class="shadow_style actual_tender">
				<h2 class="text_gray">Актуальные тендеры</h2>
				<div class="items">
					<div class="item">
						<img src="images/picture/img3.png">
						<div class="block">
							<div class="title">Мой тендер 1</div>
							<div class="row">
								<div class="dotted">Новый коментарий (3)</div>
								<div class="dotted">Новое предложение (2)</div>
							</div>
							<div class="row block_info">
								<div><span>тип</span><span>Ремонт и отладка</span></div>
								<div><span>время</span><span>12:00 24.05.2015</span></div>
								<div><span>стоимость</span><span>999 999 999 р.</span></div>
							</div>
							<div class="row">
								<a class=" info_button button_active1 shadow_style btn_green">Просмотреть тендер</a>
								<a class="btn_blue info_button button_active2 shadow_style">Дублировать тендер</a>
							</div>
						</div>
					</div>
					<div class="item">
						<img src="images/picture/img3.png">
						<div class="block">
							<div class="title">Мой тендер 2</div>
							<div class="row">
								<div class="dotted">Новый коментарий (3)</div>
								<div class="dotted">Новое предложение (2)</div>
							</div>
							<div class="row block_info">
								<div><span>тип</span><span>Ремонт и отладка</span></div>
								<div><span>время</span><span>12:00 24.05.2015</span></div>
								<div><span>стоимость</span><span>999 999 999 р.</span></div>
							</div>
							<div class="row">
								<a class=" info_button button_active1 shadow_style btn_green">Просмотреть тендер</a>
								<a class="btn_blue info_button button_active2 shadow_style">Дублировать тендер</a>
							</div>
						</div>
					</div>
					<div class="item">
						<img src="images/picture/img3.png">
						<div class="block">
							<div class="title">Мой тендер 3</div>
							<div class="row">
								<div class="dotted">Новый коментарий (3)</div>
								<div class="dotted">Новое предложение (2)</div>
							</div>
							<div class="row block_info">
								<div><span>тип</span><span>Ремонт и отладка</span></div>
								<div><span>время</span><span>12:00 24.05.2015</span></div>
								<div><span>стоимость</span><span>999 999 999 р.</span></div>
							</div>
							<div class="row">
								<a class=" info_button button_active1 shadow_style btn_green">Просмотреть тендер</a>
								<a class="btn_blue info_button button_active2 shadow_style">Дублировать тендер</a>
							</div>
						</div>
					</div>
				</div>
			</fieldset>
		</section>
		<div class="clear"></div>
	</div>
	<%@include file="footer.jsp"%>
</body>