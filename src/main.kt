fun main(){
    var temperature: Double

    print("Enter your body temperature (92-104): ")

    temperature = readLine()!!.toDouble()

    if (temperature < 97.5)
        println("Temperature is below normal range (Low)")
    else if (temperature <99.5)
        println("Temperature is in normal range (Normal)")
    else
        println("Temperature is above normal range (High)")

}