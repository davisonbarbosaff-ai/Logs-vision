@RestController
@RequestMapping("/logs")
@CrossOrigin
public class LogController {

 @Autowired LogRepository repo;

 @GetMapping
 public List<LogPunicao> listar(){
  return repo.findAll(Sort.by(Sort.Direction.DESC,"createdAt"));
 }

 @PostMapping
 public LogPunicao salvar(@RequestBody LogPunicao l){
  return repo.save(l);
 }

 @DeleteMapping("/{id}")
 public void deletar(@PathVariable Long id){
  repo.deleteById(id);
 }
}
