
Below is the generated Spring Boot application with Controller, Service, and Repository classes for the given user story:

Controller:

@RestController
@RequestMapping("/csa-management")
public class CSAManagementController {

    private final CSAManagementService csaManagementService;

    public CSAManagementController(CSAManagementService csaManagementService) {
        this.csaManagementService = csaManagementService;
    }

    @GetMapping
    public List<Functionality> getAllFunctionalities() {
        return csaManagementService.getAllFunctionalities();
    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return csaManagementService.getAllProducts();
    }

    @GetMapping("/specials-offers")
    public List<SpecialOffer> getAllSpecialsOffers() {
        return csaManagementService.getAllSpecialsOffers();
    }

    @GetMapping("/manage-stock")
    public List<Stock> getAllManageStock() {
        return csaManagementService.getAllManageStock();
    }

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return csaManagementService.getAllOrders();
    }

    @PostMapping("/new-order")
    public Order createOrder(@RequestBody Order order) {
        return csaManagementService.createOrder(order);
    }

    @GetMapping("/viewers")
    public List<Viewer> getAllViewers() {
        return csaManagementService.getAllViewers();
    }

    @GetMapping("/return-claim")
    public List<ReturnClaim> getAllReturnClaims() {
        return csaManagementService.getAllReturnClaims();
    }

    @GetMapping("/import-stock")
    public List<ImportStock> getAllImportStocks() {
        return csaManagementService.getAllImportStocks();
    }

    @GetMapping("/export-history")
    public List<ExportHistory> getAllExportHistories() {
        return csaManagementService.getAllExportHistories();
    }
}

Service:

@Service
public class CSAManagementService {

    private final CSAManagementRepository csaManagementRepository;

    public CSAManagementService(CSAManagementRepository csaManagementRepository) {
        this.csaManagementRepository = csaManagementRepository;
    }

    public List<Functionality> getAllFunctionalities() {
        return csaManagementRepository.findAllFunctionalities();
    }

    public List<Product> getAllProducts() {
        return csaManagementRepository.findAllProducts();
    }

    public List<SpecialOffer> getAllSpecialsOffers() {
        return csaManagementRepository.findAllSpecialsOffers();
    }

    public List<Stock> getAllManageStock() {
        return csaManagementRepository.findAllManageStock();
    }

    public List<Order> getAllOrders() {
        return csaManagementRepository.findAllOrders();
    }

    public Order createOrder(Order order) {
        return csaManagementRepository.saveOrder(order);
    }

    public List<Viewer> getAllViewers() {
        return csaManagementRepository.findAllViewers();
    }

    public List<ReturnClaim> getAllReturnClaims() {
        return csa