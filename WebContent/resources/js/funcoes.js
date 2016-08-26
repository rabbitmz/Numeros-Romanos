/**
 * Author: Yuri Wingester
 */
//
//$(document).ready(function() {
//	$('#btnCon').click(function(e) {
//		$.ajax({
//			url : 'enviarDados',
//			data : {
//				valor : $('#valor').val()
//			},
//			success : function(responseText) {
//				$('#errorLabel').text(responseText);
//			}
//		});
//	});
//});


function chamaEnvia()
{
	$.post("enviarDados",{valor : $('#valor').val}, function(resposta){ $('#errorLabel').text(resposta);});

}