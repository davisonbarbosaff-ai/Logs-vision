@RestController
@RequestMapping("/auth")
public class AuthController {

 @Autowired UserRepository repo;

 @PostMapping("/login")
 public User login(@RequestBody User u){
  User user = repo.findByUsername(u.getUsername());
  if(user != null && user.getPassword().equals(u.getPassword()))
   return user;
  return null;
 }
}
