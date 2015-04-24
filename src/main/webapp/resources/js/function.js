$(document).ready(function(){
	
	// аккордион
	$('#list .company').find('.details').click(function(){
		if($(this).hasClass('down')){
			//alert('f')
			$(this).text('подробно').removeClass('down');
			$(this).closest('.company').animate({height: 54},300, function(){
				$(this).removeClass('details_info');
			})
		}else{
			$(this).text('кратко').addClass('down');
			$(this).closest('.company').animate({height: 441}, 300, function(){
				$(this).addClass('details_info');
			})
		}
	})
	$('#list .company').find('.tender_close').click(function(){
		var comp = $(this).closest('.company').get(0);
		$(comp).find('.details').removeClass('down');
		$(comp).animate({height: 54},300, function(){
			$(this).removeClass('details_info');
		})
	})

	/*$('#list-search').chosen();*/
	$('#Tab a').click(function (e) {
		e.preventDefault()
		$(this).tab('show')
	});																															
	$('#Tab a[href="#profile"]').tab('show');

	$('.pop_tenders_block .pop_tender .btn a').mouseenter(function(){
		$(this).closest('.btn').addClass('hover')
	}).mouseleave(function(){
		$(this).closest('.btn').removeClass('hover')
	})

	// всплывающее сообщение. закрытие
	$('.additional_block .additional_close').click(function(){
		$(this).closest('.additional_block').animate({opacity: 0}, 500, function(){
			$(this).remove();
		})
	})

	// активное левое меню
	$('.button_left_menu').click(function(){
		$('.nav_left').animate({'margin-left':0}, 800)
	})
	$('.nav_left>div:first-of-type>div').click(function(){
		$('.nav_left').animate({'margin-left':-290}, 800)
	})

	// помощь по резюме
	$('.add_foto span').click(function(){
		$(this).addClass('active');
		$(this).next().show(500);
	})
	// закрыть помощь
	$('.add_foto .cls').click(function(){
		$(this).closest('.info').hide(500, function(){
			$('.add_foto span').removeClass('active')
		});
	})

	// plactholder переводим в название input
	$('.top_placeholder').each(function(){
		var label = document.createElement('label');
		var input = $(this).clone();
		var div = document.createElement('div');

		$(label).text($(input).attr('data-placeholder'));
		$(div).addClass('show_placeholder').addClass($(input).attr('data-type')).append(input).append(label);
		$(this).replaceWith(div);

		initPlaceholder(input);
	})

	function initPlaceholder(obj){
		var label = $(obj).next('label').get(0);
		var _color = $(obj).attr('data-font-color').split('-');
		var _size = $(obj).attr('data-font-size').split('-');
		var _top = $(obj).attr('data-top').split('-');

		$(label).css({'top': _top[0]+'px', 'z-index':-1});

		$(obj).focus(function(){
			$(this).attr('placeholder', '');
			$(label).css({'z-index':10}).animate({
				top: _top[1], 'font-size': _size[1]
			}, 300, function(){
				$(label).css({color: '#'+_color[1]})
			})
		}).blur(function(){
			if($(this).val() === ''){
				$(label).animate({
					top: _top[0],
					'font-size': _size[0]
				}, 300, function(){
					$(label).css({color:'#'+_color[0], 'z-index':-1});
					$(obj).attr('placeholder', $(obj).attr('data-placeholder'));
				})
			}
		})
	}

	var flug = true; // закрытый или открытый спсиок

	// select поиск значения
	$('.search').each(function(){
		var div = document.createElement('div');
		var input = document.createElement('input');
		var ul = document.createElement('ul');
		var select = $(this).clone();

		$(this).replaceWith(div);
		$(div).addClass('search_style');
		$(div).append(select).append(input).append(ul);

		$(select).find('option').each(function(k, option){
			var li = document.createElement('li');
			if($(option).attr('selected') != undefined) $(li).addClass('selected');
			$(li).text($(option).text());
			$(ul).append(li);

			$(input).val($(select).find(':selected').text());
		})
		$(div).on('focus', 'input', function(){
			$(this).closest('div').addClass('open');
			flug = false;
			//$(input).select();

			return false
		}).on('mouseenter', div, function(){
			if(flug == false) $(this).addClass('open')
		}).on('click', 'ul li', function(){
			var ind = $(this).index();
			$(ul).find('.selected').removeClass('selected');
			$(this).addClass('selected');

			// 
			$(select).find('option:selected').removeAttr('selected');
			var options = $(select).find('option').get();
			$(options[ind]).attr('selected', 'selected');

			// передаем значение в input
			$(input).val($(options[ind]).text());
			//$(input).change();
			$(div).removeClass('open');
			flug = true;
		})

		// ширина спсика
		var width = $(ul).outerWidth(true);
		$(ul).css('margin-left', '-'+((width/2)-20)+'px').css('width', width);

		// подтянем свойства фильтрации
		filterList($(ul), $(input));
		//$(input).change();
	})

	function filterList(list, input) {
		$(input)
			.change( function () {
				var filter = $(input).val();
				if(filter) {
					$matches = $(list).find(':contains(' + filter + ')').get();
					$('li', list).not($matches).hide();
					$($matches).show();
				} else {
					$(list).find("li").show();
				}
				return false;
			})
			.keyup( function () {
				$(this).change();
			});
	}

	// добавление файла в тех задание
	$('.file').on('change', 'input',function(){
		if($(this).val() != ''){
			var name_file = $(this).val();
			name_file = name_file.split('\\');
			name_file = name_file[(name_file.length-1)];
			if($(this).closest('li').hasClass('load')){
				var text = $(this).next('label').text();
				$(this).next('label').html(name_file);

				var file = $(this).closest('.file').get(0);
				var count = $(file).find('li').length;

				var li = document.createElement('li');
				var input = document.createElement('input');
				var label = document.createElement('label');

				$(label).html(text).attr('for', 'file'+(parseInt(count)+1));
				$(input).attr('type', 'file').attr('id', 'file'+(parseInt(count)+1));

				$(li).addClass('load').append(input).append(label).append('<span></span>');

				$(file).find('ul').append(li);
			}else{
				$(this).next('label').html(name_file);
			}
			$(this).closest('li').removeClass('load');			
		}
	})

	// удалить файл их тех поддержки
	$('.file').on('click', 'label+span', function(){
		$(this).closest('li').animate({opacity: 0}, 500, function(){
			$(this).remove();
		})
	})

	$('#btnReg').click(function(){
		$('.overlay').show();
		$('#modalReg').show();

		return false;
	})

	$('.overlay').click(function(){
		$('.modal').hide();
		$(this).hide();
	})

	$('.modal_close').click(function(){
		$(this).closest('.modal').hide();
		$('.overlay').hide();
	})

	$('.picture_length').owlCarousel({
		items: 1,
		nav: true,
		autoplay: true
	});

	$('.acordion .title').click(function(){
		var item = $(this).closest('.item').get(0);
		$('.acordion .open').find('.text').slideUp(500, function(){
			$('.acordion .open').removeClass('open');
			$(item).find('.text').slideDown(500, function(){
				$(item).addClass('open');
			})
		});
		
	})

	if($('#map_canvas').get(0) != undefined) initialize();
	function initialize() {  
		var myLatlng = new google.maps.LatLng(55.755826, 37.6173);
		var myOptions = {
			zoom: 13,
			center: myLatlng,
			mapTypeId: google.maps.MapTypeId.ROADMAP
		}
		var map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
		var infowindow = new google.maps.InfoWindow({
			content: '<div id="content">Тут всё то про что должно быть рассказано</div>'
		});

		var markers = [];

		markers.push( new google.maps.Marker({
			position: new google.maps.LatLng(55.725846, 37.649643),
			map: map,
			title: 'Uluru (Ayers Rock)',
			icon: './img/marker1.png'
		}) );

		markers.push( new google.maps.Marker({
			position: new google.maps.LatLng(55.7653087, 37.616522),
			map: map,
			title: 'Петровка',
			icon: './img/marker1.png'
		}) );

		markers.push( new google.maps.Marker({
			position: new google.maps.LatLng(55.7525579, 37.5882833),
			map: map,
			title: 'Новый арбат',
			icon: './img/marker1.png'
		}) );

		markers.push( new google.maps.Marker({
			position: new google.maps.LatLng(55.7596524, 37.626862),
			map: map,
			title: 'Китай городок',
			icon: './img/marker.png'
		}) );

		markers.push( new google.maps.Marker({
			position: new google.maps.LatLng(55.760706, 37.581251),
			map: map,
			title: 'Барикадная',
			icon: './img/marker1.png'
		}) );

		$.each(markers, function(k,mark){
			google.maps.event.addListener(mark, 'click', function() {
				$('.map_box .details_info').animate({'bottom': 0}, 500, function(){

				});
			});
		})
		$('.map_box .details_info .tender_close, .map_box .details_info .details').click(function(){
			$(this).closest('.details_info').animate({'bottom': -451}, 500, function(){

			})
		})
	}
})