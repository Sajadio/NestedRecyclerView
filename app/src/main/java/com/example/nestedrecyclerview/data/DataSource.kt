package com.example.nestedrecyclerview.data

object DataSource {

    fun getRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                id = 5417,
                translatedRecipeName = "Kerala Style Whole Wheat Parotta Recipe",
                totalTimeInMin = 40,
                cuisine = "Kerala Recipes",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/1-Author/sibyl_sunitha/Kerala_Style_Whole_Wheat_Parotta_Recipe_.jpg"
            ),
            Recipe(
                id = 532,
                translatedRecipeName = "Kashmiri Style Bharit Marchavangun Recipe-Stuffed Chillies",
                totalTimeInMin = 60,
                cuisine = "Kashmiri",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/1-Author/Jyothi_Rajesh/Barith_MarchavangunKashmiri_Stuffed_Chilies.jpg"
            ),
            Recipe(
                id = 741,
                translatedRecipeName = "Carrot and Ginger Spiced Dosa Recipe",
                totalTimeInMin = 8,
                cuisine = "South Indian Recipes",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/1-Author/nithya.anantham/Carrot_and_Ginger_Spiced_Dosa.jpg"
            ),
            Recipe(
                id = 344,
                translatedRecipeName = "Fansi Muthia Nu Shaak Recipe - Green Beans With Gram Flour Dumplings",
                totalTimeInMin = 40,
                cuisine = "Gujarati Recipes",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/0-Archanas-Kitchen-Recipes/2019/Fansi_Muthia_Nu_Shaak_Video_Recipe_Gujarati_Beans_Muthia_Sabzi_12_1600.jpg"
            ),
            Recipe(
                id = 1150,
                translatedRecipeName = "Palak Paneer Bhurji Recipe -Spiced Cottage Cheese Scramble With Spinach Recipe",
                totalTimeInMin = 45,
                cuisine = "North Indian Recipes",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/0-Archanas-Kitchen-Recipes/2016/oct-6/Palak_Paneer_Bhurji_Recipe_Spice_Cottage_Cheese_Scramble_Serve_with_Toasted_Pav-2.jpg"
            ),
            Recipe(
                id = 2691,
                translatedRecipeName = "Mediterranean Pumpkin Kibbeh Recipe",
                totalTimeInMin = 45,
                cuisine = " Middle Eastern",
                imageUrl = "https://www.archanaskitchen.com/images/archanaskitchen/0-Archanas-Kitchen-Recipes/2018/Article-2018/Pumpkin_Kibbeh_Recipe_Mediterranean_dish-1.jpg"
            ),
        )
    }

    fun getAdvices(): List<HealthAdvice> {
        return listOf(
            HealthAdvice(
                id = 15,
                title = "Minimize your sugar intake",
                description = "Added sugar is extremely prevalent in modern food and drinks. A high intake is linked to obesity- type 2 diabetes- and heart disease. The Dietary Guidelines for Americans recommend keeping added sugar intake below 10% of your daily calorie intake- while the World Health Organization recommends slashing added sugars to 5% or less of your daily calories for optimal health. ",
                imageUrl = "https://joya.info/images/content/1816720-1200x700c48x43-7-Tipps-wie-du-deinen-Zuckerkonsum-reduzierst.jpg"
            ),
            HealthAdvice(
                id = 22,
                title = "Get rid of excess belly fat",
                description = "Excessive abdominal fat- or visceral fat- is a uniquely harmful type of fat distribution that is linked to an increased risk of cardiomegaly diseases like type 2 diabetes and heart disease. For this reason- your waist size and waist-to-hip ratio may be much stronger markers of health than your weight. ",
                imageUrl = "https://hips.hearstapps.com/hmg-prod/images/gettyimages-541110640-1529946643.jpg"
            ),
            HealthAdvice(
                id = 19,
                title = "Use plenty of herbs and spices",
                description = "There is a variety of herbs and spices at our disposal these days- more so than ever. They not only provide flavor but also may offer several health benefits as well. For example- ginger and turmeric both have potent anti-inflammatory and antioxidant effects- which may help improve your overall health. Due to their powerful potential health benefits- you should aim to include a wide variety of herbs and spices in your diet.",
                imageUrl = "http://cdn.shopify.com/s/files/1/0554/7632/2444/articles/Photo-What-Are-Herbs-Blog-Post-Feature-image.jpg"
            ),
            HealthAdvice
                (
                id = 14,
                title = "Use extra virgin olive oil",
                description = "Extra virgin olive oil is one of the healthiest vegetable oils you can use. It’s loaded with heart-healthy monounsaturated fats and powerful antioxidants that have anti-inflammatory properties. Extra virgin olive oil may benefit heart health- as people who consume it have a lower risk of dying from heart attacks and strokes according to some evidence. ",
                imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2021/08/18/olive-oli-in-glass-cruet-glass-bowl-olives-wood-surface.jpg.rend.hgtvcom.406.305.suffix/1629320083324.jpeg"
            ),
            HealthAdvice
                (
                id = 2,
                title = " Avoid ultra -processed foods",
                description = "Ultra-processed foods are foods containing ingredients that are significantly modified from their original form. They often contain additives like added sugar- highly refined oil- salt- preservatives- artificial sweeteners- colors- and flavors as well. Examples include: snack cakes - fast food - frozen meals - canned foods - chips.",
                imageUrl = "https://www.mashed.com/img/gallery/the-free-website-that-helps-consumers-avoid-ultra-processed-foods/l-intro-1657158611.jpg"
            ),
            HealthAdvice
                (
                id = 13,
                title = "Get moving",
                description = "Doing aerobic exercise- or cardio is one of the best things you can do for your mental and physical health. It’s particularly effective at reducing belly fat- the harmful type of fat that builds up around your organs. Reduced belly fat may lead to major improvements in your metabolic health.",
                imageUrl = "https://img.livestrong.com/375/clsd/getty/4b9daf68d7e143039679910ae9e6a533.jpg"
            ),
            HealthAdvice
                (
                id = 6,
                title = "Feed your gut bacteria",
                description = "The bacteria in your gut- collectively called the gut microbiota- are incredibly important for overall health. A disruption in gut bacteria is linked to some chronic diseases- including obesity and a myriad of digestive problems. Good ways to improve gut health include eating probiotic foods like yogurt and sauerkraut- taking probiotic supplements — when indicated — and eating plenty of fiber. Notably- fiber serves as a probiotic- or a food source for your gut bacteria.",
                imageUrl = "https://st2.depositphotos.com/1186033/8005/i/600/depositphotos_80054472-stock-photo-probiotic-prebiotic-foods-diet.jpg"
            ),
        )
    }
}