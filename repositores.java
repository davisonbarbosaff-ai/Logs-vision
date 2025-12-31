public interface UserRepository extends JpaRepository<User,Long> {
 User findByUsername(String username);
}

public interface LogRepository extends JpaRepository<LogPunicao,Long> {}
