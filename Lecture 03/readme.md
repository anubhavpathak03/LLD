Homework:

What is Operater Overloading and why it is not supported in other Languages except C++ ?

Ans - Operator overloading does not exist in many languages because it can reduce readability, introduce ambiguity, and complicate language design. C++ allows it to support mathematical expressiveness and make user-defined types behave like built-in types, while resolving everything at compile time without performance overhead.



``` 
#include <iostream>
using namespace std;

class Vector {
public:
    int x, y;

    // Constructor
    Vector(int x, int y) {
        this->x = x;
        this->y = y;
    }

    // Operator overloading for +
    Vector operator+(const Vector& other) {
        return Vector(x + other.x, y + other.y);
    }

    void print() {
        cout << "(" << x << ", " << y << ")" << endl;
    }
};

int main() {
    Vector a(2, 3);
    Vector b(4, 1);

    Vector c = a + b;   // operator overloading in action

    c.print();          // Output: (6, 4)
}
```


-> Basically it gives freedom to make operator their own way