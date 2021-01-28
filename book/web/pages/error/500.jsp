<%--
  Created by IntelliJ IDEA.
  User: zzy
  Date: 2021/1/28
  Time: 7:18 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link type="text/css" rel="stylesheet" href="static/css/error.css">
    <title>错误页面-500</title>
</head>

<body translate="no">
<div id='outer'>
    <h1>5</h1>
    <h1>0</h1>
    <h1>0</h1>
    <div class='wrap'>
        <div class='ghost'>
            <div class='inner'></div>
        </div>
        <div class='ghost'>
            <div class='inner'></div>
        </div>
        <div class='ghost'>
            <div class='inner'></div>
        </div>
    </div>
</div>
<svg xmlns="http://www.w3.org/2000/svg" version="1.1" style="display:none">
    <defs>
        <filter id="squiggly-0">
            <feTurbulence id="turbulence" baseFrequency="0.03" numOctaves="3" result="noise" seed="0"/>
            <feDisplacementMap id="displacement" in="SourceGraphic" in2="noise" scale="2"/>
        </filter>
        <filter id="squiggly-1">
            <feTurbulence id="turbulence" baseFrequency="0.02" numOctaves="3" result="noise" seed="1"/>
            <feDisplacementMap in="SourceGraphic" in2="noise" scale="3"/>
        </filter>
        <filter id="squiggly-2">
            <feTurbulence id="turbulence" baseFrequency="0.02" numOctaves="3" result="noise" seed="2"/>
            <feDisplacementMap in="SourceGraphic" in2="noise" scale="0.5"/>
        </filter>
        <filter id="squiggly-3">
            <feTurbulence id="turbulence" baseFrequency="0.02" numOctaves="3" result="noise" seed="3"/>
            <feDisplacementMap in="SourceGraphic" in2="noise" scale="3"/>
        </filter>
        <filter id="squiggly-4">
            <feTurbulence id="turbulence" baseFrequency="0.05" numOctaves="2" result="noise" seed="4"/>
            <feDisplacementMap in="SourceGraphic" in2="noise" scale="1"/>
        </filter>
    </defs>
</svg>
<script>
    window.console = window.console || function (t) {
    };
</script>
<script>
    if (document.location.search.match(/type=embed/gi)) {
        window.parent.postMessage("resize", "*");
    }
</script>
</body>
</html>