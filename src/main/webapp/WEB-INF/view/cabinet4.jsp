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
						<li><a href="">Актуальные (3)</a></li>
						<li><a href="">Завершенные (2)</a></li>
						<li class="disabl"><a href="">Неудачные (0)</a></li>
					</ul>
				</li>
				<li><a href="">Настройки</a></li>
				<li class="select"><a href="">Счет</a></li>
			</ul>
		</aside>
		<section class="right clear profile">
			<fieldset class="shadow_style">
				<div class="pumb">
					<div class="balans">Ваш баланс - 1 452 рубля</div>
					<div class="row">
						<label>Пополнить счет на: </label>
						<input type="text" placeholder="Введите сумму">
						<label> руб.</label>
						<a href="" class="info_button button_active1 shadow_style btn_green">Пополнить</a>
					</div>
				</div>
				<div class="what2">
					<div class="title">Что это?</div>
					<p>С этого счета списывается комиссия за выполнение тендеров.</p>
					<p>Поддерживайте положительный баланс для возможности оставлять предложения и пользоваться всеми возможностями сервиса.</p>
				</div>
			</fieldset>
			<div class="clear"></div>
			<br><br>
			<fieldset class="shadow_style">
				<h2 class="text_gray">Часто задаваемые вопросы</h2>
				<div class="acordion">
					<div class="item open">
						<div class="title">Часто задаваемый вопрос 1?</div>
						<div class="text">Равным образом начало повседневной работы по формированию позиции влечет за собой процесс внедрения и модернизации систем массового участия.</div>
					</div>
					<div class="item">
						<div class="title">Часто задаваемый вопрос 2?</div>
						<div class="text">Равным образом начало повседневной работы по формированию позиции влечет за собой процесс внедрения и модернизации систем массового участия.</div>
					</div>
					<div class="item">
						<div class="title">Часто задаваемый вопрос 3?</div>
						<div class="text">Равным образом начало повседневной работы по формированию позиции влечет за собой процесс внедрения и модернизации систем массового участия.</div>
					</div>
					<div class="item">
						<div class="title">Часто задаваемый вопрос 4?</div>
						<div class="text">Равным образом начало повседневной работы по формированию позиции влечет за собой процесс внедрения и модернизации систем массового участия.</div>
					</div>
				</div>
			</fieldset>
		</section>
		<div class="clear"></div>
	</div>
	<%@include file="footer.jsp"%>
</body>