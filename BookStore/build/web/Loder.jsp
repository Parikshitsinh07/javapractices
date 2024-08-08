<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Loder</title>
  </head>
  <style>
    .loader {
      width: calc(160px / 0.707);
      height: 28px;
      background: repeating-linear-gradient(
          -45deg,
          hsl(229, 100%, 76%) 0 30px,
          #0000 0 40px
        )
        left/200% 100%;
      animation: i3 2s infinite linear;
      border-radius: 10px;
      border: 1px solid hsl(229, 100%, 76%);
    }

    @keyframes i3 {
      100% {
        background-position: right;
      }
    }
  </style>
  <body>
    <div class="loader"></div>
  </body>
</html>
