package com.example.git_ex
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.assertIsDisplayed
import org.junit.Rule
import org.junit.Test
class ComposeTest {

        @get:Rule
        val composeTestRule = createComposeRule()

        @Test
        fun testCompose() {
            // Set nội dung của Compose
            composeTestRule.setContent {
                Greeting(name = "Phương")
            }

            // Kiểm tra có đúng text "Hello Phương!" hay không
            composeTestRule.onNodeWithText("Hello Phương!")
                .assertIsDisplayed()
        }
    }
