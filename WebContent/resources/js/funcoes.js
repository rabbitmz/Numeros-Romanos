/**
 * Author: Yuri Wingester
 */

function converterEActualizar(valor)
{
	$.post("enviarNumero", {'valor' : valor}, function()
			{
				alert("haaa");
			});
}