# Take 2 numbers as inputs and find their HCF and LCM.

Steps:
1. Start the program
2. Input both numbers a = num1, b = num2
3. while b is not equal to 0:
    Set temp = b
    Set b = a mod b
    set a = temp

HCF = a
LCM = (num1 * num2) / HCF
output "HCF:", HCF
output "LCM:", LCM
4. End the program