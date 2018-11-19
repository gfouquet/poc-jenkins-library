def call(body) {
    stage("Single Stage") {
        body()
    }
}