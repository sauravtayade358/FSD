package sl.NestedRepetedTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All Outer Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All Outer Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each Outer Class");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After EAch Outer Class");
	}

	@Test
	void test() {
	
		System.out.println("Test Case of Outer Class");
	}
	
	@Nested
    class Inner
    {
        @BeforeEach
        void setUp() throws Exception {
            System.out.println("Before Each Inner Class");
        }
        @AfterEach
        void tearDown() throws Exception {
            System.out.println("After Each Inner Class");
        }
        @Test
        @DisplayName("Test of Inner class")
        void test() {
            System.out.println("Test case of Inner class");
        }
        
        @Nested
        class WhenX
        {
            @BeforeEach
            void setUp() throws Exception {
                System.out.println("Before Each WhenX Class");
            }
            @AfterEach
            void tearDown() throws Exception {
                System.out.println("After Each WhenX Class");
            }
            
            @Test
            @DisplayName("Test of Whenx class")
            void test() {
                System.out.println("Test case of WhenX class");
            }
        }
    }
	
}
