# *Secure Password Generator*
### Project by **`Patrick Moran`**

<table>
    <tr>
        <td><a href="http://www.paktric.com/">paktric.com</a></td>
        <td><a href="https://www.github.com/paktric/">github.com/paktric</a></td>
        <td><a href="https://www.linkedin.com/in/paktric/">linkedin.com/in/paktric/</a></td>
    </tr>
</table>

---

<br />

# Project Overview
### Motivation
When creating an online account, Google Chrome has an option to generate a secure password and save the login information to your Google account. Often times, these are secure but unmemorable passwords like ```5tX`EH47_(dm/8rR$N\T?w;bt*v^nD```. The goal of this project is to create a similar password generation program.

### Objective
- Create a program that generates a unique and secure password
- Allow the user to specify the length of the password

<br />

# Development Process
### Technologies Used
- Java
- GitHub for version control

### Implementation
The first step is to define an alphabet to use. For this, we'll use all uppercase and lowercase letters, numbers 0 thru 9, and all standard special characters. We concatenate these into one string called `Alphabet`. We can then use the SecureRandom class to select a random character from the `Alphabet` string. We concatenate these random characters to the password string until the password length has been reached, and then we return the password.

### Challenges
Issues can arise when generating a random number. The number may seem random, but can often be predictable. For this reason, many languages have a feature like Java's [SecureRandom](https://docs.oracle.com/javase/8/docs/api/java/security/SecureRandom.html) class, which generates a better random number for security applications.

<br />

# Conclusion
The program is able to successfully generate a unique and secure password. These types of passwords are unmemorable and are best used with password-management programs that manage your login credentials. I plan to expand this project by adding a program that will generate a *memorable* password.
