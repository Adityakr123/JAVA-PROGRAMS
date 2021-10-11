<?php
$submit=0;
if(isset($_POST['name'])){
    $name = $_POST['name'];
    if($name=="8860611"){
        echo"Done";
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<form action="index.php" method="post">
    <lable>8860611</lable>
    <input type="text" name="name" id="name" placeholder="Enter above number">
    <button class="btn" >Submit</button>
    </form>

    
</body>
</html>