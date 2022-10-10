# 改造herocat-starter支持访问静态资源
## herocat-starter初始化时将StaticServlet缓存到本地，客户端访问/blabla.html时，请求会被映射到StaticServlet，该StaticServlet会去recources目录下查找blabla.html，有则返回该页面，否则报错“page not found”。
## herocat-starter的使用者只需将需要访问的页面放到resources目录下，无需添加新的Servlet。
## 初始提交为原始代码，第二次提交为做的改造。
