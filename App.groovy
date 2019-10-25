@RestController
class App {
    @RequestMapping("/")
    def hello() {
        "hello, world!\n"
    }
}
