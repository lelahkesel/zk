(ns clojuredocs.pages.jobs
  (:require [clojuredocs.util :as util]
            [somnium.congomongo :as mon]
            [clojuredocs.pages.common :as common]
            [clojure.string :as str]))

(def DATA [{:job-title "Senior Engineer (Clojure, Datomic, Clojurescript)"
            :job-type "Permanent"
            :job-location "Berlin, Germany"
            :job-apply-href "https://fy.breezy.hr/p/c5d1455dcaf801-senior-engineer-clojure--datomic--clojurescript"
            :id "fy1"
            :short-id "fy1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Fy!"
            :company-url "https://www.iamfy.co"
            :company-image-url "/img/fy-logo.jpg"
            :company-description "At Fy! we are passionate about using technology to help people discover things that they love. Our iOS app connects women to the most exciting lifestyle products from around the World, through an addictive and serendipitous shopping experience.

We are funded and backed by some of the savviest investors in Europe including Forward Partners, 500 Startups and ex-leadership of ASOS, Streetcar and LoveFilm. We are a small but passionate and experienced team of entrepreneurs, technologies and market experts working to build something huge. Join us!"
            :job-description "Our iOS app and internal systems are built from the ground up using Clojure(script) and Datomic. The kinds of technical challenges we are taking on range from real-time recommendation to innovative shopping experiences such as customisation and AR.

## Responsibilities

* Design, develop and test new features across our systems: eCom, search, recommendation, notifications, supplier platform and reporting
* Develop backend services using Clojure, Datomic and GraphQL
* Build end-to-end tested frontends in Clojurescript using Om Next and our in-house UI component library
* Maintain and deploy services via AWS and Kubernetes
* Deliver load time and responsiveness improvements to our users
* Manage technical debt and make improvements to the existing codebase


## Requirements

* 2+ years of relevant Clojure or Clojurescript experience
* Deep experience in developing on either the JVM on in the browser
* Flexibility and adaptability to work in a fast-paced startup
* A passion for delivering benefits and solving pain-points for customers
* Experience with Datomic, React, React Native and GraphQL are all bonus points
* A dedication to good software development practices
* Good communication skills (in English)"}
           {:job-title "Lead Clojure Engineer"
            :job-type "Permanent"
            :job-location "New York City, NY"
            :job-apply-href "https://jobs.lever.co/spacious/b0f65550-8a4a-40c8-8694-389d6b10dc16"
            :id "spacious1"
            :short-id "spcs1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Spacious"
            :company-url "https://www.spacious.com/"
            :company-image-url "/img/spacious-logo.jpg"
            :company-description "Spacious offers a new way to access the most important urban centers of commerce, creativity, and humanity. Using a unique approach to commercial property, we can increase access to our densest and most valuable urban destinations. We believe that the diversity of people, ideas, and resources is what makes cities attractive, and Spacious seeks to remove the artificial boundaries that otherwise might prevent many of us from participating in everything that cities have to offer.

The first part of our mission is focused on making unused spaces available during the hours that they're not being used, starting with high end restaurants that are closed before dinner. We open the doors to these beautiful spaces in their off hours, creating a space where our members can work, meet, connect, and be creative.

We are fundamentally changing how urban dwellers interact with their city. We do this through a unique business model, extraordinary hospitality, and an obsession with building seamless technology that underpins the entire operation. Everything we do, and all the technology we build, is designed to make the lives of every stakeholder simpler, easier, and more empowering."
            :job-description "Spacious is looking for an experienced, enthusiastic Lead Clojure Engineer to join our team and lead us in building Clojure and Datomic backend services.

We???d like someone to help us build more sustainable processes around our infrastructure and in the long term, evaluate our options and build our future architecture and development patterns. There is room for improvement in how our small engineering team maintains and adds to a wide range of APIs and interfaces. We want to build automated, self-healing services that are highly available to our stakeholder, easy to deploy and add to, and let the entire team sleep well at night.

Reporting to the CTO, you will be responsible for researching, designing and developing a broad range of infrastructure required to support our many existing and planned products. Our tech team is still small and incredibly interdisciplinary. To build and maintain our many products everyone is expected to be a bit of a generalist, to collaborate, and to share knowledge. We prize simplicity and repeatability in the systems we build, and that is why we are embracing Clojure despite being new to it.

## What you will achieve:

* **Within your first month**
* You'll build a deep understanding of Spacious??? current initiatives and technology infrastructure(Javascript, Python running on Heroku and Google), coding style and standards, and have contributed code to our repositories.
* As Lead Clojure Engineer you'll begin to set up our Clojure development environment and deployment process.
You'll pair regularly with other engineers to gain familiarity with our systems and help all of us be proficient in Clojure.


* **By the end of month 3**
* You should have added features to our existing projects, and (re)architected at least one core system.
Understand one problem domain in depth e.g.: location discovery, check in, onboarding, in space communication, space administration.
* Improve the infrastructure of your chosen domain to be faster, more reliable, and easier to reason about and build upon.


* **From there your role will continue to evolve**
* Right now scaling into new cities is our biggest priority. Due to the complexity of operating physical spaces, there is still plenty of work to be done automating the most repetitive tasks, increasing reliability, and improving performance. We are also constantly prototyping new ideas and services we might offer our members. Some of the projects and ideas underway include:
* Adding to our GraphQL API
* Seamless WiFi authorization and onboarding
* Native mobile apps for members and for our hosts
* Kioskless check in/out via GPS, iBeacons, Computer Vision
* Fully integrated and automated expense tracking, payroll, accounting, and payouts
* Testing out other space partnerships and forms of space consumption
* Logistics and reducing the time to open a new location from weeks to days


## What we expect:

* **Know your Computer Science**
* Have a strong CS background, in order to choose the right algorithms, systems approaches and patterns to solve problems, without reinventing the wheel.
* Because of the speed at which we're moving and the seniority of the role, candidates need to be able to hit the ground running from day one. Therefore, 4+ years of industry experience are expected.


* **Have real expertise in web infrastructure and backend services**
* Experience building Clojure and Datomic backends, ideally in production environments.
Familiarity profiling everything from the request to the DB.
Be comfortable weighing performance, developer velocity and code quality with business goals.


* **Act as a technologist**
* Bias towards action and shipping. Once you???ve sketched out an idea, you find the fastest path to a prototype to prove the concept
* Strong ability to write production code quickly.
* Be comfortable with a range of languages and open source tools and frameworks, and make good decisions about which to use to solve a particular problem.
* Be creative: you???ll come up with new ideas based on your broad understanding of technological possibilities and domain knowledge.


* **Solve problems, together**
* Come up with novel solutions, working well with non-technologists and others.
* Ask hard questions and challenge assumptions to ensure that we???re solving the right problems



## What you can expect:
* A membership to Spacious. We don???t have an office or central headquarters. Instead we work out of our locations, side by side with our customers
* Flexible schedule. Work when and where you want, including from home
* Unlimited vacation
* 80% of health, dental & vision insurance
* One Medical and Teledoc
* Paid parental leave
* Life insurance
* 401(k)
* Citi Bike membership
* Wage works commuter benefits
* 50% reimbursement for a personal computer


At Spacious, we don???t just accept differences in background and perspective - we celebrate it, we support it, and we thrive on it for the benefit of our employees, our products and our community. Spacious is proud to be an equal opportunity workplace and is an affirmative action employer. We are committed to equal employment opportunity regardless of race, color, ancestry, religion, sex, national origin, sexual orientation, age, citizenship, marital status, disability, gender identity or Veteran status. We also consider qualified applicants regardless of criminal histories, consistent with legal requirements. If you have a disability or special need that requires accommodation, please let us know."}

           {:job-title "Backend Clojure Engineer"
            :job-type "Permanent"
            :job-location "Redwood City, CA"
            :job-apply-href "https://jobs.lever.co/outpostgames/506cbe36-439f-46d0-8b94-e1406d0abef3"
            :id "outpost1"
            :short-id "outpost1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Outpost Games"
            :company-url "https://corp.outpostgames.com/#intro"
            :company-image-url "/img/outpost-logo.png"
            :company-description "We believe that every player should experince the thrill of the spotlight. On our platform, Hero, streamers will be discovered by their audience and feel the roar of their crowd.

Every audience member has the ability to deeply interact with their favorite performers and influence the key moments in critical matches.

Our goal is for players and game developers to better understand their audience in order to foster incredible performances.

Outpost Games was founded by gaming veterans from Electronic Arts and Zynga, and has raised over $19M from Benchmark and other strategic investors.

Our team is made up of forward thinking people who collaborate in a self-directed environment."
            :job-description "We're in the middle of a huge industry shift where gaming is not just about content, but will instead be powered by the performances from players and their audiences. This is a great time to join us at Outpost Games as we're building a technology platform to turn every player into a performer through live interactive tools and APIs. To showcase our platform, we're creating a multiplayer survival game, titled SOS, which is built from the ground up to be as thrilling to watch as it is to play. Join us and work alongside industry veterans from EA, Zynga, Naughty Dog, and Google to take a fresh approach on gaming and entertainment.

We???re looking for an exceptional server-side engineer to join our platform team. This is an early role in a highly iterative environment with the opportunity to have a large impact from day one.


## Core Technologies

Clojure, Python, JavaScript, DynamoDB, Redis, Memcached, AWS (lots). We mostly build services using Clojure, but evaluate new tools and technologies where they provide leverage.


# What You'll Do

* Design, develop, and maintain services powering our platform clients (mobile/native/web) and 1st-party game, SOS, including account, leaderboard, matchmaking, storage, and real-time stream interaction services
* Improve the reliability, scalability, and performance of REST (JSON over HTTP), GraphQL, and WebSocket services
* Write maintainable, secure, and well-tested code
* Constructively review other engineers code and provide architectural feedback
* Work in a professional software engineering environment (source control, dev/stage/prod release cycle, live monitoring)
* Collaborate early and often with a cross-functional team on new product features


# What We're Looking For

* 6+ years experience building and scaling customer-facing web applications or distributed systems
* Bachelor's degree in Computer Science, or equivalent demonstrated experience
* Expertise in Clojure, Scala, Java, Go, Python, or C++. Clojure or other functional programming languages strongly preferred.
* Proficiency with other languages and technologies, and enthusiasm for learning
* An effective communicator, who seeks and values a diversity of perspectives
* Authorization to work in the U.S.


# Bonus Points

* Start-up experience
* Full-stack ability, particularly JavaScript
* Experience building JVM oriented systems
* Hands-on experience with AWS
* Practical experience with analytics systems (data pipelines, ETL and streaming)
* A passion for playing or watching video games


Changing the entertainment business is hard work, but we do it sustainably. We invest in your health and productivity through great benefits, including medical, dental, vision, 401k, commuter benefits, unlimited PTO, and free lunch if you eat with 4 or more colleagues!

Outpost Games is proud to be an Equal Opportunity Employer committed to a diverse and inclusive workforce ??? Minority / Female / Disability / Veteran / Gender Identity / Sexual Orientation."}






           {:job-title "Software Engineer"
            :job-type "Permanent"
            :job-location "Durham, NC"
            :job-apply-href "https://angel.co/adzerk/jobs"
            :id "adz1"
            :short-id "adz1"
            :remote-ok? false
            :posted-at (util/now)
            :comp-cash {:currency "USD"
                        :minimum 70000
                        :maximum 120000}
            :comp-equity {:minimum 0.001
                          :maximum 0.005}
            :company-name "Adzerk"
            :company-url "https://www.adzerk.com/"
            :company-image-url "/img/adzerk-logo.png"
            :company-description "At Adzerk we are passionate about making the internet a better place. We are the ad serving infrastructure for awesome companies like reddit, StackOverflow, Bittorrent, Yummly, Strava and many others. We serve over a billion impressions a month, over 25k requests a second, and continue to grow at an awesome pace."
            :job-description "Ready to put all those ideas about scalability into practice in a situation where you really need it? We???re helping StackOverflow, reddit, and other sites that you???ve probably heard of serve over a billion ads per day??? and that number is growing very fast.

Adzerk engineers are responsible for working on all parts of the system. This includes the front-end web application, back-end services, and the ad delivery engines. Our platform is built using Node.js with Coffeescript, Clojure, Mono, JQuery, MongoDB, and Hadoop, with a whole lot of AWS and Chef. We???re currently serving over 25,000 req/sec (and growing fast), so you???ll get to work on some real scalability challenges.

Performance and scalability are our two primary concerns, and with the traffic and growth rates that we???re experiencing, lots of the lessons that you???ve learned start to break down. Because of that, it???s not as important what you know right now ??? what matters is how quickly you can learn and adapt.

Things you should be interested in -- or even better, have experience with:

* Clojure
* Large-scale distributed systems
* HTML, CSS, JavaScript
* Bonus points for startup experience!
* Things you should know about us:

We have an engineering-driven culture, and our CEO is a software developer. We have no professional managers ??? everyone contributes.

Your work will have an immediate and profound impact on our product and business.

We ship code dozens of times a week.

You will have the freedom and responsibility for choosing what tools and libraries we use.

We use the open source model internally to manage our work. We submit pull requests, and other engineers review them before merging.

We prize open source, and do our best to contribute back to the community.

Everyone gets equity. We want a team of partners.

We all have unlimited vacation. We work hard, but at a sustainable pace.

You must be eligible to work in the United States and willing to work in Adzerk's Durham, NC office."}
           {:job-title "Clojure Engineer"
            :job-type "Permanent"
            :job-location "San Francisco, CA"
            :job-apply-href "https://www.fundingcircle.com/us/about/careers/?source=clojuredocs"
            :id "fc1"
            :short-id "fc1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Funding Circle"
            :company-url "https://www.fundingcircle.com/us/about/"
            :company-image-url "/img/funding-circle-box-logo.png"
            :company-description "Funding Circle is the world???s leading marketplace exclusively focused on small businesses ??? more than $2.5bn has been lent to 20,000 businesses in the UK, USA, Germany, Spain and the Netherlands. Today, businesses can borrow directly from a wide range of investors, including more than 55,000 people, the UK Government, local councils, a university and a number of financial organizations."
            :job-description "Funding Circle brings together small businesses and investors in a way that is truly revolutionary. We're here to foster an environment where small business can thrive. Our online platform provides a marketplace where investors receive better returns and small businesses find lower rates. The driving force behind our product is our engineering team; we are building elegant, sustainable, and scalable infrastructure on a global scale, and we want you to be a part of it!

Our mission: to build a better financial world.

# Prospectus

Would you describe yourself as a creative and ambitious engineer who???s always ready to take on the next cutting edge technology? If your answer is yes, you???re going to fit right in with our global team. We???re looking for an experienced and enthusiastic Clojure Engineer who will bring elegance and simplicity to the forefront of our distributed systems. We are a group of passionate engineers whose bread and butter is learning new technologies and fostering a collaborative and inclusive environment - we???re looking for partners in crime who feel the same.


# Bird???s eye view of the role

* Be an automator: we are continually reevaluating our stack to improve efficiency throughout the pipeline. We practice continuous integration and have a container-based deployment workflow.
* Be a builder: you???ll build and expand our highly-available architecture to handle over $2 billion in loans originated through our pipeline.
* Be a collector: you???ll help build scalable infrastructure to collect data for real time analytics and risk modeling.
* Be a collaborator: you???ll be expected to forge deep bonds with your business counterparts to truly understand the needs of our Borrowers and Investors. We work in an Agile environment including pair programming and daily stand-ups.
* Be a teacher: be generous with your time and expertise to teach stakeholders and our fellow engineers how to answer their own questions with tools you build.


# Our ideal teammate has

* At least 1 year of professional experience working with Clojure (or really strong personal projects using Clojure).
* 3+ years of overall software engineering experience in any language (Ruby, Python, Java, etc).
* An interest in Functional Programming languages.
* Comfortable in a Unix/Linux environment.


# Brownie points for

* Github or other open source code we can check out.
* Distributed systems experience.
* Experience with microservices and/or event-driven architecture.
* Operating at scale with low-latency systems.
* Familiarity with Docker, Mesos, and/or experience with distributed database systems, such as Cassandra.


# Why Join Us?

Happy employees are productive employees, that???s why we offer a hearty benefits package. From learning and development and commuter stipends, to a competitive salary, equity, and health benefits, we???ve got you covered! That being said, have you heard about what we're doing?! Our mission is what really motivates us to come to work each day:

* We're supporting small business, the engine of economic growth.
* We're helping facilitate higher yields for investors and lower interest rates for borrowers.
* We can fund loans extremely quickly, all online!
* We have a clear competitive advantage globally in areas like domain expertise and regulatory processes.

To learn more about our work environment, culture, and perks, visit:

* https://www.fundingcircle.com/us/careers
* https://www.themuse.com/companies/fundingcircle


*Pursuant to the San Francisco Fair Chance Ordinance, we will consider for employment qualified applicants with arrest and conviction records.*

*Funding Circle provides equal employment opportunity to all individuals regardless of their race, age, creed, color, religion, national origin or ancestry, sex, gender, disability, veteran status, genetic information, sexual orientation, gender identity or expression, pregnancy, or any other characteristic protected by state, federal, or local law.*"}
           {:job-title "Sr. Clojure Engineer"
            :job-type "Permanent"
            :job-location "San Francisco, CA"
            :job-apply-href "https://www.fundingcircle.com/us/about/careers/?source=clojuredocs"
            :id "fc2"
            :short-id "fc2"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Funding Circle"
            :company-url "https://www.fundingcircle.com/us/about/"
            :company-image-url "/img/funding-circle-box-logo.png"
            :company-description "Funding Circle is the world???s leading marketplace exclusively focused on small businesses ??? more than $2.5bn has been lent to 20,000 businesses in the UK, USA, Germany, Spain and the Netherlands. Today, businesses can borrow directly from a wide range of investors, including more than 55,000 people, the UK Government, local councils, a university and a number of financial organizations."
            :job-description "Funding Circle brings together small businesses and investors in a way that is truly revolutionary. We're here to foster an environment where small business can thrive. Our online platform provides a marketplace where investors receive better returns and small businesses find lower rates. The driving force behind our product is our engineering team; we are building elegant, sustainable, and scalable infrastructure on a global scale, and we want you to be a part of it!

Our mission: to build a better financial world.

# Prospectus

Would you describe yourself as a creative and ambitious engineer who???s always ready to take on the next cutting edge technology? If your answer is yes, you???re going to fit right in with our global team. We???re looking for an experienced and enthusiastic Clojure Engineer who will bring elegance and simplicity to the forefront of our distributed systems. We are a group of passionate engineers whose bread and butter is learning new technologies and fostering a collaborative and inclusive environment - we???re looking for partners in crime who feel the same.


# Bird???s eye view of the role

* Be an automator: we are continually reevaluating our stack to improve efficiency throughout the pipeline. We practice continuous integration and have a container-based deployment workflow.
* Be a builder: you???ll build and expand our highly-available architecture to handle over $2 billion in loans originated through our pipeline.
* Be a collector: you???ll help build scalable infrastructure to collect data for real time analytics and risk modeling.
* Be a collaborator: you???ll be expected to forge deep bonds with your business counterparts to truly understand the needs of our Borrowers and Investors. We work in an Agile environment including pair programming and daily stand-ups.
* Be a teacher: be generous with your time and expertise to teach stakeholders and our fellow engineers how to answer their own questions with tools you build.


# Our ideal teammate has

* at least 2 years of professional experience working with Clojure (or really strong personal projects using Clojure).
* 5+ years of overall software engineering experience in any language (Ruby, Python, Java, etc).
* an interest in Functional Programming languages.
* comfortable in a Unix/Linux environment.


# Brownie points for

* Github or other open source code we can check out.
* distributed systems experience.
* experience with microservices and/or event-driven architecture.
* operating at scale with low-latency systems.
* familiarity with Docker, Mesos, and/or experience with distributed database systems, such as Cassandra.


# Why Join Us?

Happy employees are productive employees, that???s why we offer a hearty benefits package. From learning and development and commuter stipends, to a competitive salary, equity, and health benefits, we???ve got you covered! That being said, have you heard about what we're doing?! Our mission is what really motivates us to come to work each day:

* We're supporting small business, the engine of economic growth.
* We're helping facilitate higher yields for investors and lower interest rates for borrowers.
* We can fund loans extremely quickly, all online!
* We have a clear competitive advantage globally in areas like domain expertise and regulatory processes.

To learn more about our work environment, culture, and perks, visit:

* https://www.fundingcircle.com/us/careers
* https://www.themuse.com/companies/fundingcircle


*Pursuant to the San Francisco Fair Chance Ordinance, we will consider for employment qualified applicants with arrest and conviction records.*

*Funding Circle provides equal employment opportunity to all individuals regardless of their race, age, creed, color, religion, national origin or ancestry, sex, gender, disability, veteran status, genetic information, sexual orientation, gender identity or expression, pregnancy, or any other characteristic protected by state, federal, or local law.*"}
           {:job-title "Backend Developer"
            :job-type "Permanent"
            :job-location "Charlottesville, VA"
            :job-apply-href "https://www.roomkey.com/careers.html#back-end-dev"
            :id "rk1"
            :short-id "rk1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Room Key"
            :company-url "https://www.roomkey.com"
            :company-image-url "/img/room-key-logo.jpg"
            :company-description "Room Key is a hotel search engine founded by six of the world's leading hotel companies. Join our dynamic team and enter the exciting and challenging world of online travel!

Room Key has the culture and practices of an agile start-up. We move fast, work hard and have lots of fun along the way. But unlike your typical start-up, we are backed by huge names in the hotel industry, all of whom have a vested interest in our success. You might have heard of one or two of them ;-)"
            :job-description "Room Key is looking for a software engineer with strong server-side web development experience - preferably with the Clojure programming language - to join our backend web development team in Charlottesville, Virginia (sorry, no remote work available).

Solve interesting problems! At scale! Using Clojure! Room Key's website regularly handles over 500,000 unique visitors per day.

You'll be working in an agile shop, with the best team of motivated and smart individuals this side of the Mississippi. We're all 10x-ers.

The environment is fun, friendly, collaborative, and is really fast-paced: schedules are measured in days, not weeks, and our team is obsessed with delivering world-class quality software and services.

# Benefits

* Learn from and contribute to a highly talented team
* A world-class location in historic Charlottesville, VA
* Cutting edge Clojure/Clojurescript/Javascript tech stack
* Excellent compensation, bonus scheme and benefits, including medical, dental, 401(k)
* Agile working practices
* Open vacation policy
* Flexible working hours
* Travel related perks
* Attend your annual choice of tech conference
* Highly competitive office Mario Kart

# Ideally You Have

* Phenomenal testing principles (and perseverance), incl. perhaps a grounding in basic stats
* Excellent communication and collaboration skills
* Willingness to fulfill multiple roles
* BS in Computer Science (but equivalent real-world experience is even better)
* Experience with Clojure or other functional programming languages
* Experience with several database types: object stores (redis), relational (postgres)
* Experience with JVM-hosted development
* Experience with Amazon Web Services (the more the better) and Kafka
* Experience with GIS and spatial analysis
* 5+ years professional software development experience
* 5+ years professional web experience
* Experience with service oriented architectures
* Demonstrated interest/experience in high performance, scalable systems
* xkcd in your daily-read list
* Enthusiasm, team-contributor mindset and obsessive attention to detail
* Don't be shy! If you are enthusiastic but only have a subset of our ideal qualifications, we still want to hear from you.

# How To Apply

E-mail your resume to [jobs@roomkey.com](jobs@roomkey.com). Please also include a recent code sample relevant to our technology stack and representative of your best work."}
           {:job-title "Frontend Web Applications Developer"
            :job-type "Permanent"
            :job-location "Charlottesville, VA"
            :job-apply-href "https://www.roomkey.com/careers.html#front-end-dev"
            :id "rk2"
            :short-id "rk2"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Room Key"
            :company-url "https://www.roomkey.com"
            :company-image-url "/img/room-key-logo.jpg"
            :company-description "Room Key is a hotel search engine founded by six of the world's leading hotel companies. Join our dynamic team and enter the exciting and challenging world of online travel!

Room Key has the culture and practices of an agile start-up. We move fast, work hard and have lots of fun along the way. But unlike your typical start-up, we are backed by huge names in the hotel industry, all of whom have a vested interest in our success. You might have heard of one or two of them ;-)"
            :job-description "Roomkey.com requires an experienced Javascript developer with a deep understanding of large-scale front-end web applications. Knowledge of established frameworks such as Backbone.js is expected as well as a demonstrated interest and awareness of where the latest client-side technologies are heading, for instance functional reactive programming and ES6. A strong understanding and passion for what constitutes good UI/UX is essential. A rigorous approach to testing is expected along with knowledge of the latest client-side development tooling.

# Benefits

* Learn from and contribute to a highly talented team
* A world-class location in historic Charlottesville, VA
* Cutting edge Clojure/Clojurescript/Javascript tech stack
* Excellent compensation, bonus scheme and benefits, including medical, dental, 401(k)
* Agile working practices
* Open vacation policy
* Flexible working hours
* Travel related perks
* Attend your annual choice of tech conference
* Highly competitive office Mario Kart


# Responsibilities
* Work as a key member of an agile development team in a relaxed, proactive environment.
* Design and develop new user-facing features to enhance and grow a product already receiving 10-15 million unique visits a month.
* Evolve an existing web application to take advantage of the latest and best practices.
* Collaborate with back end developers in designing and maintaining the API consumed by our front end applications.
* Translate UI/UX requirements into lightweight, performant and scalable code.
* Keep abreast of the latest front end technologies and use them to develop new product ideas and concepts through hackathons and skunkworks projects.
* Attend at least one yearly technology conference to keep your skills and enthusiasm sharp.


# Skills and Qualifications
* Expert-level understanding of JavaScript, preferably with at least five years??? experience in a commercial setting developing large-scale front-end web applications.
* Excellent understanding of HTML5 and CSS3 along with higher level templating engines and CSS preprocessors.
* Good understanding of Backbone.js (or other frameworks), jQuery and Underscore.js.
* Experience with Javascript testing libraries such as Mocha, Chai and Sinon and associated tooling and technologies such as PhantomJS, Selenium and BrowserStack.
* Enthusiasm for exploring a functional reactive approach to building client-side web applications using React/Redux or higher level languages such as ClojureScript.
* Proficient understanding of cross-browser compatibility issues and ways to work around such issues.
* Familiarity with JavaScript module loaders, such as Webpack and Browserify.
* Familiarity with front-end build tools, such as Grunt, Gulp and npm.
* An understanding of the use of Node.js in a development environment.
* Proficient understanding of code versioning tools, such as Git.
* Good understanding of browser rendering behavior and performance across mobile and desktop platforms.
* Bonus Points for Experience in Any of the Following:
* ClojureScript!
* UI design using Photoshop, Illustrator or similar
* Developing browser extensions
* Developing mobile applications
* Amazon Web Services (AWS)
* Multivariate testing, metrics and statistics
* Mario Kart Wii

# What Next?

Interested? Please email a resume to [jobs@roomkey.com](jobs@roomkey.com). Please also attach a recent code sample representative of your best work."}
           {:job-title "Clojure/ClojureScript Web Developer"
            :job-type "Permanent"
            :job-location "Toronto, Canada"
            :job-apply-href "https://kirasystems.com/careers#op-131123-clojureclojurescript-web-developer"
            :id "ki1"
            :short-id "ki1"
            :remote-ok? true
            :posted-at (util/now)
            :company-name "Kira Systems"
            :company-url "https://kirasystems.com"
            :company-image-url "/img/kira-logo.png"
            :company-description "Kira Systems is a fast-growing Toronto-based software company. We equip enterprises with intuitive, easy-to-use software tools for uncovering relevant information from their contracts and related documents.

Our software, Kira, automatically identifies and extracts relevant provisions from contracts in virtually any format. Kira???s contract search capabilities were originally developed for review of third party contracts in M&A due diligence, and, as a result, our technology is able to handle nonstandard forms and provisions with ease.

Our customers include some of the world???s largest corporations, law firms, and professional service firms. We make serious enterprise software, we have fun doing it, and are always looking for talented people to join our team. We strive to constantly learn, question the crowd, push the boundaries of existing technology, and solve difficult problems."
            :job-description "Kira Inc. is a Toronto-based startup using machine learning to automate legal work. We???re looking for a developer to work on our Clojure and ClojureScript web application. Our stack includes  reactive single-page web client code and a distributed backend to handle internal computations.

Our team is small, pragmatic, and inquisitive; we love learning new technologies and balance adoption with good analysis.  To us, agile is a verb, not a noun, we adopt what works for us rather than strictly following a particular methodology.  We prefer to hire near our downtown Toronto office, but also welcome remote work in a time zone within North America.

This position focuses on internal tools such as application analytics and service integrations.

# Things you will work on

* Client-side UI code.
* Server-side REST routes.
* Platform and core APIs.
* Document and report generation.

# Technologies we use

* HTML, CSS, SASS,
* Clojure, ClojureScript, Reagent (React.js),
* SQL, PostgreSQL, Java,
* RabbitMQ, ElasticSearch, Docker

You should have knowledge of some of these. Most of all we look for those interested in learning.

# Please send us:

* cover letter ??? tell us why you???re interested and what you look for in a job,
* resume/linkedin profile,
* link to github projects or other work samples.

We want to hear from you. Apply on this page or email your resume to kirasystems@applications.recruiterbox.com with 'Web Developer' in the subject line."
            }
           {:job-title "Senior Backend Engineer"
            :job-type "Permanent"
            :job-location "Ann Arbor, MI"
            :job-apply-href ""
            :id "fl1"
            :short-id "fl1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "FarmLogs"
            :company-url "https://farmlogs.com"
            :company-image-url "/img/farmlogs-logo.png"
            :company-description "Everyday our people work towards a mission to create a better future for one of the world???s most important industries.

Farmers today are faced with an increasingly complex problem. To feed a population on the rise, they???ll need to grow more food, on less land, in an unstable world economy.

If you didn???t grow up on a farm, you can pretty much throw what you think you know about farming out the window. We???re using things like satellite imagery, real-time weather data, and predictive analytics to help farmers grow more with less.

The FarmLogs team is a group of smart and passionate people, laser-focused on solving a real-world problem. If you???re looking for new work that???s personally and professionally fulfilling, where you???ll have a direct line of sight into the difference you???re making not just in the company, but in the world, we encourage you to apply!"
            :job-description "Our mission is to invent the future of farming. We're transforming the oldest and most important industry in the world from \"gut instinct\" to data science. Our platform already exposes critical operational data insights to 1 out of every 3 farms in the U.S. and our users absolutely love us.

# Who You Are

You???re smart, you???re a good engineer, and you get things done. You get a thrill out of building things from scratch and taking ownership over your work. You live and breathe for the start-up culture where life is fast-paced and full of opportunity. You enjoy working with smart people, value their feedback, and like working collaboratively on problems. You enjoy writing clean and testable code, you don???t overcomplicate things, and you know how to choose the right tool for the problem you???re trying to solve.

# About the Role

As a senior member of our backend team, you will be creating APIs and services to provide access to a wide range of data sets - weather, satellite imagery, soil information, farming practices, seed inputs etc. You will collaborate with our data science team to design and build machine learning models to be able to make better recommendations to increase profitability and yield for a farmer.

# Tasks You???ll Be Juggling

* Understand business requirements, work with other team members, and develop solid engineering solutions
* Responsible for implementing features from inception to deployment
* Commitment to maintaining and improving functionality on an ongoing basis
* Provide coaching and mentorship to junior engineers
* Review code for your peers and provide feedback


# Your Creds

Required skills/qualifications:

* 6+ years of professional engineering experience
* Demonstrated ability to mentor and coach other engineers
* Adept at identifying pragmatic solutions
* Demonstrated ability to write clean and testable code
* Ability to dissect complex technical challenges and quickly deliver elegant solutions
* Interested in presenting data in a useful way and deriving new information from it
* Love working with miscellaneous data formats and third party APIs
* Effective and efficient communication at all levels of technical detail. Negotiating scope and estimating time commitments is a major part of the job

Nice to have:

* Previous work experience at a startup
* Proficient in Python, Clojure, or Postgres
* Experience with AWS infrastructure
* Familiarity with statistical analysis and machine learning techniques
* Knowledge and passion for the farming industry"}
           {:job-title "Software Creator, Generalist"
            :job-type "Permanent"
            :job-location "New York, NY"
            :job-apply-href "http://intentmedia.com/jobs/?gh_jid=453872"
            :id "im1"
            :short-id "im1"
            :remote-ok? false
            :posted-at (util/now)
            :company-name "Intent Media"
            :company-url "https://intentmedia.com/"
            :company-image-url "/img/intentmedia-logo.png"
            :company-description "# We are building a business in a market that hasn???t existed before.

We???re creating an innovative advertising platform that is shaking up the ecommerce industry with a combination of fresh thinking and exceptional technology. As a growth-stage business, we???re looking for people to help us scale, tackle new challenges and create a whole new kind of company."
            :job-description "# Intent Media isn???t your usual company.

Our work is powered by the premise that every person at Intent Media is unique, possessing a distinct set of skills, personality and passions.  We embrace our collective talents to tackle technical challenges, refine our successfully disruptive business ideas and co-create one of the most human and inspiring work cultures out there. We are a team of deep collaborators, valuing and rewarding shared success over individual heroics.

As a Software Creator at Intent Media you???ll code and innovate on products that are changing the ecommerce industry. Our engineering teams help the world???s leading travel companies to serve tens of millions of ads every day across the United States and around the world. These ads provide an exceptional user experience to help shoppers find and compare prices, while simultaneously increasing brand profitability.

In our engineering work we balance cutting-edge technologies with industry-proven practices. Our polyglot approach means you will see a variety of backend languages, Javascript libraries, and databases. Our agile way of working is founded on many years of experience; you will be working with accomplished innovators in the software community.


# What you will do

We believe that engineers are most effective when they are involved with the whole lifecycle of software development: conceiving new features, designing and coding the change, testing, deploying, and support. You???ll be performing all these activities as part of a closely collaborating squad. Don???t worry if you don???t know how to do everything at first - you???ll learn the essentials through pair programming with experienced engineers on your team.


# About you

Intent Media is looking for bright and ambitious software engineers to join our team of thoroughly awesome humans and dogs.

* You???re motivated, collaborative, open, and able to thrive in our close-knit team.
* You have experience with at least one common object-oriented language (Java, Ruby, etc.)
* You have experience with databases and SQL.
* You have experience with, or interest in, functional programming - several of our teams are using languages like Clojure and Scala, and modern Java also has functional idioms.
* You posses a solid grounding in computer science including algorithms and data structures.
* You have the flexibility to work on all aspects of delivering working software, including analysis, design, automated testing, cross team collaboration, and support.
* And you have a solid understanding of, and ideally experience with, web application development.


# About us

Intent Media operates the world???s most powerful platform for advertising on commerce sites. We help online travel companies unlock their full revenue potential with innovative, high-margin advertising products powered by predictive analytics. Our customers include the world's largest online travel agencies, metasearch companies, airlines, hotels and car rental agencies.

Every day, we???re inspired by two pursuits. First, we???re imagining and building novel products that are upending ecommerce. Second, we???re building the company we???ve always wanted to work for ??? one that???s open, human and collaborative, where very smart people come together to share ideas and get things done.



# Why work at Intent Media

We are over 100 people and a dozen cool dogs with offices in the best neighborhoods in New York City and London. We're backed by Redpoint, Matrix and Insight, plus some of the world???s leading individual investors, including Reid Hoffman, Brian O'Kelley, Kevin Ryan and David Rosenblatt. Crain's has named us one of the Best Places to Work in NYC five years in a row.

Our vibrant team accomplishes a lot every day, but we insist upon work/life balance so things never become stale. We don???t take ourselves too seriously, but we take our work very seriously. We believe that in order for our employees to perform their best, they need access to strategic decisions, and so our flat structure and open communication invite innovation from all levels ??? ideas flow freely.

We offer competitive compensation and great benefits; stock options; learning budget, and company-wide social events."}])

(defn format-currency [s]
  (condp = s
    "USD" "$"
    "EUR" "???"
    "GBP" "??"
    s))

(defn delim-for [s]
  (condp = s
    "USD" ","
    "EUR" "."
    "GBP" "."
    ","))

(defn format-number [s & [delim]]
  (->> s
       str
       reverse
       (partition-all 3)
       (interpose (or delim ","))
       flatten
       reverse
       (apply str)))

(defn url-safe [s]
  (-> s
      (str/replace " " "-")
      (str/replace #"[^a-zA-Z0-9-_]" "")))

(defn job-slug [{:keys [job-title company-name]}]
  (->> (str company-name "-" job-title)
       url-safe
       str/lower-case))

(defn currency-range [comp]
  (str
    (format-currency
      (-> comp :currency))
    (format-number
      (-> comp :minimum)
      (delim-for (-> comp :currency)))
    "-"
    (format-number (-> comp :maximum)
      (delim-for (-> comp :currency)))))

(defn equity-range [comp]
  (str
    (* 100 (-> comp :minimum))
    "-"
    (* 100 (-> comp :maximum))
    "%"))

(defn $job-preview [{:keys [job-title job-type
                            job-location
                            job-description
                            job-apply-href
                            short-id
                            posted-at
                            comp-cash
                            comp-equity
                            company-name
                            company-url
                            company-image-url
                            remote-ok?]
                     :as job}
                    &
                    [{:keys [description?
                             show-apply-button?
                             comp?
                             posted-at?]}]]
  [:div.job-preview
   [:div.row
    {:style "position:relative"}
    [:div.col-sm-2.col-xs-3.text-center
     [:img {:src company-image-url
            :style "width:100%;max-width:100px"}]]
    [:div.col-sm-10.col-xs-9
     {:style "vertical-align:top;"}
     [:div
      [:h3 {:style "margin:0;line-height:110%"}
       [:a {:href (str "/jobs/" short-id "/" (job-slug job))} job-title]]]
     [:h4 {:style "font-size:14px;margin:0;margin-top:5px"}
      [:span.company-name
       {:style "margin-right:10px;font-weight:normal"}
       [:a {:href company-url} company-name]]
      [:span.job-location
       {:style "color:#888;margin-right:10px;font-weight:normal"}
       [:i.fa.fa-map-marker
        {:style "margin-right:5px"}]
       job-location]
      (when remote-ok?
        [:span.remote-ok
         {:style "color:#888"}
         [:i.fa.fa-globe
          {:style "margin-right:5px"}]
         "Remote"])]
     (when (and comp-cash)
       [:div.comp
        [:span.comp-cash
         (currency-range comp-cash)]
        (when comp-equity
          [:span.comp-equity
           " ??? "
           (equity-range comp-equity)])])

     (when show-apply-button?
       [:div
        {:style "margin-top:10px"}
        [:a.btn.btn-success
         {:href job-apply-href
          :target "_blank"}
         "Apply Now"]])

     (when description?
       [:div.description-preview
        {:style "margin-top:5px;font-size:13px;line-height:150%;color:#777;font-weight:300"}
        (util/ellipsis 80 job-description)])
     #_(when posted-at?
         [:div.posted-at.text-right
          {:style "font-size:10px;font-weight:bold;text-transform:uppercase;color:#aaa;margin-top:3px"}
          "Posted " (util/timeago posted-at) " ago"])
     ]]])

(defn list-handler [{:keys [params uri user]}]
  (common/$main
    {:body-class "jobs-page"
     :title (str "Clojure Jobs | ClojureDocs - Community-Powered Clojure Documentation and Examples")
     :meta {:description "Find open Clojure jobs from companies that fit you."}
     :user user
     :page-uri uri
     :content
     [:div.row
      [:div.col-md-12
       [:div.list-jobs-header
        {:style "padding-bottom:5px;margin:0;position:relative;"}
        [:h2 {:style "text-align:left;margin:0;color:#888;font-size:16px;font-weight:bold;line-height:120%;text-transform:uppercase"}
         "Latest Clojure Jobs"]
        [:div {:style "position:absolute;bottom:5px;right:0;font-size:12px"}
         [:a {:href "/jobs/about"} "About ClojureDocs Jobs"]]]
       (->> DATA
            (map (fn [job]
                   [:div.job-preview-wrapper
                    ($job-preview job
                      {:show-apply-button? false
                       :description? true
                       :comp? true
                       :posted-at? true})])))]]}))

(defn find-job [job-id]
  (->> DATA
       (filter #(= job-id (:short-id %)))
       first))

(defn track-job-view [job]
  (mon/update! :job-metrics
    {:_id (:id job)}
    {:$inc {:views 1}}))

(defn single-handler [job-id]
  (fn [{:keys [params uri user]}]
    (let [job (find-job job-id)]
      (when job
        (track-job-view job)
        (common/$main
          {:body-class "jobs-page"
           :title (str "Clojure Jobs | ClojureDocs - Community-Powered Clojure Documentation and Examples")
           :user user
           :page-uri uri
           :meta {:robots "noindex"}
           :content
           [:div.row
            [:div.col-md-10.col-md-offset-1
             (let [{:keys [job-description company-description
                           company-name
                           job-apply-href]} job]
               [:div.job-info
                {:style "border-top:solid #ccc 1px;padding:20px 0px"}
                [:div
                 {:style "position:relative;"}
                 ($job-preview job {:show-apply-button? true})]
                [:div.job-description
                 [:h2.section-header "Job Description"]
                 (util/markdown job-description)]
                [:br]
                [:div.company-description
                 [:h2.section-header "About " company-name]
                 (util/markdown company-description)]
                [:br]
                [:div.apply-now
                 [:a.btn.btn-success.btn-lg
                  {:href job-apply-href
                   :target "_blank"}
                  "Apply Now"]]])]]})))))

(defn post-handler [{:keys [params uri user]}]
  (common/$main
    {:body-class "post-job-page"
     :title (str "Post a Job | ClojureDocs - Community-Powered Clojure Documentation and Examples")
     :user user
     :page-uri uri
     :content
     [:div#page-content]}))

(defn about-handler [{:keys [params uri user]}]
  (common/$main
    {:body-class "jobs-page"
     :title (str "About ClojureDocs Jobs | ClojureDocs - Community-Powered Clojure Documentation and Examples")
     :user user
     :page-uri uri
     :content
     [:div.row
      [:div.col-md-8.col-md-offset-2.col-sm-10.col-sm-offset-1
       [:h1
        {:style "text-align:center;border-bottom:solid #ccc 1px;margin-bottom:10px;padding-bottom:5px;font-size:24px"}
        "About ClojureDocs Jobs"]
       [:p "Hey Everybody!"]
       [:p "So we're trying something new here in the form of a jobs board hosted here on ClojureDocs. We'll be starting slow; rolling out a few listings over the coming weeks while we track how they're doing and adjust."]
       [:p "Ultimately, I'd like to use this as a way to fund development on the site and cover maintenance costs, so the biggest thing you can do to help out (other than switching jobs) is to get the word out. For those of you working at great Clojure shops, "
        [:a {:href "mailto:zachary.kim@gmail.com"} "drop me a line"]
        " and I'll reach out to see if we can get your company listed."]
       [:p "The goal is to make this work great for everybody. I think that's going to take a few iterations, so let me know if you have any ideas along these lines."]
       [:p "Thanks!"]
       [:div "- Zack"]
       [:div {:style "font-weight:bold;font-size:12px;text-transform:uppercase"}
        "Oct 11, 2016"]]]}))
