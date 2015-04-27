<!doctype html>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
	<div class="overlay"></div>
	<%@include file="header.jsp"%>
	<section class="wrapper790 registration">
		<div class="pop_tenders">Регистрация поставщика</div>		
		<div class="shadow_style clear">
			<form>
				<fieldset>
					<legend>Контактное лицо</legend>
					<div class="row">
						<input type="text" placeholder="Ф.И.О. Контактного лица">
					</div>
					<div class="row">
						<input type="text" placeholder="Телефон контактного лица">
					</div>
					<div class="row">
						<input type="text" placeholder="Адрес эл. почты контактного лица">
					</div>
				</fieldset>
				<fieldset>
					<legend>Реквизиты</legend>
					<div class="row">
						<input type="text" placeholder="Название компании">
					</div>
					<div class="row">
						<input type="text" placeholder="ОГРН" class="width50">
						<div class="file inline">
							<ul>
								<li class="load">
									<input id="file1" type="file" >
									<label for="file1">загрузить свидетельство</label>
								</li>
							</ul>
						</div>
					</div>
					<div class="row">
						<input type="text" placeholder="ИНН" class="width50">
					</div>
					<div class="row">
						<input type="text" placeholder="Юр. адрес">
					</div>
					<div class="row">
						<input type="text" placeholder="Фактический адрес">
					</div>
					<div class="row">
						<input type="text" placeholder="Телефон">
					</div>
					<div class="row">
						<input type="email" placeholder="Адрес эл. почты">
					</div>
					<div class="row">
						<input type="text" placeholder="Ф.И.О. руководителя">
					</div>
					<div class="row">
						<input type="text" placeholder="Описание компании">
					</div>
				</fieldset>
				<fieldset>
					<legend>Банк</legend>
					<div class="row">
						<input type="text" placeholder="Наименование">
					</div>
					<div class="row">
						<input type="text" placeholder="БИК">
					</div>
					<div class="row">
						<input type="text" placeholder="к/с">
					</div>
					<div class="row">
						<input type="text" placeholder="р/с">
					</div>
				</fieldset>
				<fieldset>
					<legend>Лицензии</legend>
					<div class="row">
						<input type="text" placeholder="Название лицензии">
					</div>
					<div class="row">
						<input type="text" placeholder="Дата выдачи" class="width50">
						<div class="file inline">
							<ul>
								<li class="load">
									<input id="file2" type="file">
									<label for="file2">загрузить скан</label>
								</li>
							</ul>
						</div>
					</div>
					<div class="row">
						<div class="file licens">
							<ul class="list">
								<li class="load">
									<input id="file3" type="file">
									<label for="file3">добавить лицензию</label>
								</li>
							</ul>
						</div>
					</div>
				</fieldset>
				<fieldset>
					<legend>Категория участия</legend>
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
					<div class="row">
						<input type="submit" class="info_button button_active1 shadow_style" value="Зарегестрироваться">
					</div>
				</fieldset>
			</form>
		</div>

	</section>
	<%@include file="footer.jsp"%>
</body>