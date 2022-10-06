<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!-- jstl을 사용하기 위한 선언 -->

        <!DOCTYPE html>
        <html lang="ko">

        <head>
            <!-- bootstrap을 css cdn -->
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
                type="text/css" />

            <!-- jquery cdn -->
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        </head>

        <body>
            <div class="layout">
                <form action="upload" method="post" enctype="multipart/form-data">
                    <input name="file" type="file">
                    <button type="submit">작성</button>
                </form>

            </div>
            <script type="text/javascript">
                function boardIn() {
                    $('#frm').submit();
                }
            </script>

        </body>

        </html>