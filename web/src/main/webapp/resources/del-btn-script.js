
		
		all = document.querySelectorAll('[type="checkbox"]');
		var button = document.querySelector('#delNewsBtn');
		
		for (var i = 0; i < all.length; i++) { 
			all[i].onclick = function() {
				var allChecked = document
						.querySelectorAll('[type="checkbox"]:checked').length;				
				if(allChecked>0){ button.disabled=false;}
				else{   button.disabled=true;}
			}
		}

		
		
