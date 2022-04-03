con = pool.getConnection();
string sql = "select * from user where username ='"+ username +"' and password = '" + password + "'";
stmt = conn.createStatement();
rs = stmt.executeQuery(sql);
if (rs.next()){
	loggedIn = true;
	out.println(Autenticado exitosamente);
} else {
	out.println("usuario y/o password noreconocida");
}