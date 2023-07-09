package lesson_2

fun main() {
    val employeeCount: Int = 50
    val employeeSalary: Int = 30000
    val internCount: Int = 30
    val internSalary: Int = 20000

    val expensesEmployeeSalary: Int = employeeCount * employeeSalary
    val expensesInternSalary: Int = internCount * internSalary
    val expensesEISalary: Int = expensesEmployeeSalary + expensesInternSalary
    val middleSalary: Float = expensesEISalary / (employeeCount + internCount).toFloat()
    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesEmployeeSalary\n" +
            "Общие расходы по ЗП после прихода стажеров: $expensesEISalary\n" +
            "Средняя ЗП одного сотрудника после устройства стажеров: "+String.format("%.2f", middleSalary))
}