var dates = new Array();

	/* 	$.datepicker.setDefaults({
	 dateFormat : 'yy-mm-dd',
	 prevText : '이전 달',
	 nextText : '다음 달',
	 monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월',
	 '10월', '11월', '12월' ],
	 monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월',
	 '9월', '10월', '11월', '12월' ],
	 dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
	 dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
	 dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
	 //showMonthAfterYear : true,
	 yearSuffix : '년',

	 showOtherMonths : false,
	 selectOtherMonths : false,

	 minDate : 0,
	 maxDate : "+2M",
	 numberOfMonths : 2
	 //showButtonPanel : true
	 });
	 */
	 
	 function totalCal() {
			for (var i = 0; i < dates.length; i++) {
				console.log(dates[i]);
			}
		}
	 
	function addDate(date) {
		if (jQuery.inArray(date, dates) < 0) {
			dates.push(date);
		}
	}

	function removeDate(index) {
		dates.splice(index, 1);
	}

	// Adds a date if we don't have it yet, else remove it
	function addOrRemoveDate(date) {
		var index = jQuery.inArray(date, dates);
		if (index >= 0)
			removeDate(index);
		else
			addDate(date);
	}

	// Takes a 1-digit number and inserts a zero before it
	function padNumber(number) {
		var ret = new String(number);
		if (ret.length == 1)
			ret = "0" + ret;
		return ret;
	}

	$(function() {
		$("#datepicker").datepicker(
				{

					prevText : '이전 달',
					nextText : '다음 달',
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ],
					monthNamesShort : [ '1월', '2월', '3월', '4월', '5월', '6월',
							'7월', '8월', '9월', '10월', '11월', '12월' ],
					dayNames : [ '일', '월', '화', '수', '목', '금', '토' ],
					dayNamesShort : [ '일', '월', '화', '수', '목', '금', '토' ],
					dayNamesMin : [ '일', '월', '화', '수', '목', '금', '토' ],
					//showMonthAfterYear : true,
					yearSuffix : '년',

					showOtherMonths : false,
					selectOtherMonths : false,

					minDate : 0,
					maxDate : "+2M",
					numberOfMonths : 2,

					onSelect : function(dateText, inst) {
						addOrRemoveDate(dateText);
					},
					beforeShowDay : function(date) {
						var year = date.getFullYear();
						// months and days are inserted into the array in the form, e.g "01/01/2009", but here the format is "1/1/2009"
						var month = padNumber(date.getMonth() + 1);
						var day = padNumber(date.getDate());
						// This depends on the datepicker's date format
						var dateString = month + "/" + day + "/" + year;

						var gotDate = jQuery.inArray(dateString, dates);
						if (gotDate >= 0) {
							// Enable date so it can be deselected. Set style to be highlighted
							console.log(dateString);
							return [ true, "ui-state-highlight" ];
						}
						// Dates not in the array are left enabled, but with no extra style
						return [ true, "" ];
					}
				});
	});