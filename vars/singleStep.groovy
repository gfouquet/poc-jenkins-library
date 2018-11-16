def call(body) {
    stage("single step") {
        body()
    }
}