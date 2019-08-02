
$(':checkbox').change(function() {
    var path = "http://localhost:3030/api/todos/"+this.id+"?done="+this.checked;
    $.ajax({url: path, success: function(result){
        alert("BRAWO!!");
           // udało się
    }});
}); 