 <script type="text/javascript">
            function add()
            {
            first_number = document.getElementById("Number1").value;
            second_number = document.getElementById("Number2").value;
            var result = first_number + second_number;
            document.getElementById("result").innerHTML = result;    
            }
            function sub()
            {
            first_number = document.getElementById("Number1").value;
            second_number = document.getElementById("Number2").value;
            var result = first_number - second_number;
            document.getElementById("result").innerHTML = result;    
            }
            function mul()
            {
            first_number = document.getElementById("Number1").value;
            second_number = document.getElementById("Number2").value;
            var result = first_number * second_number;
            document.getElementById("result").innerHTML = result;    
            }
            function div()
            {
            first_number = document.getElementById("Number1").value;
            second_number = document.getElementById("Number2").value;
            var result = first_number / second_number;
            document.getElementById("result").innerHTML = result;    
            }
        </script>