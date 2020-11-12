import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Testing GetModel End Point"
    request {
        method GET()
        url("/api/v1/store-commerce-service/store/1001") {
        }
    }
    response {
        body(file("jsons/modelresponse.json"))
        status 200
    }
}