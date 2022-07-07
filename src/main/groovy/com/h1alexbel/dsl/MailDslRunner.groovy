package com.h1alexbel.dsl

import static com.h1alexbel.dsl.MailDslBuilder.mail

mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images(['image.jpg', 'image2.png'])
        image 'test.jpeg'
    }
}