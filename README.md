# Encryption_Decryption
Core Java Secuirity Algorithm: this module contains Encryption decryptuon algorithm with Strategy Pattern

### Examples

1. `Example 1`: reading and writing to files; the arguments are: -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode

This command must get data from road_to_treasure.txt, encrypt the data with the key of 5, create protected.txt, and write ciphertext into it.

2. `Example 2`: encryption with the unicode algorithm; the arguments are: -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode

\jqhtrj%yt%m~ujwxpnqq&

3. `Example 3:` decryption with the unicode algorithm; the arguments are: -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

Welcome to hyperskill!

4. `Example 4`: encryption with the shift algorithm; the arguments are: -key 5 -alg shift -data "Welcome to hyperskill!" -mode enc

Bjqhtrj yt mdujwxpnqq!

5. `Example 5:` decryption with the shift algorithm; the arguments are: -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec

Welcome to hyperskill!
