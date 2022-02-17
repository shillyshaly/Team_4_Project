# Team_4_Project
Camp Management System
> **PROJECT REQUIREMENTS**
>
> COMP350, Spring 2022
>
> You, as part of an instructor-assigned team, must complete the
> software development project specified in this handout, according to
> the time requirements specified in the course schedule.
>
> Your team must use Agile techniques and practices covered in COMP350
> to develop the software. The use of other techniques, including
> traditional software engineering and project management tools, is
> discouraged.
>
> The most important aspects of the Agile approach are centered on
> delivering working, tested code to support the most essential user
> stories. This is an iterative and incremental process. Your first cut
> on the solution should have just enough of everything to provide
> what's needed in the user stories you were able to cover in the time
> provided. There should not be "full" solutions for other aspects---for
> example, don't start off by creating the entire database that you
> might need for the final project (as you imagine it). Just have enough
> of everything to have correct functionality for the user stories you
> have done.
>
> Concentrate on being able to create software using the techniques
> covered in this course, namely the agile methods and tools covered in
> our readings and videos. If you are going to worry about the\
> programming involved, worry about matters such as coding style,
> refactoring, testing, and other topics in the course.
>
> The user interface for the software does not need to be fancy. It can
> be text-intensive, rather than graphical. (In fact, Docker seems to
> have some problems playing nicely with some Java graphics approaches,
> so simple is better in these terms.) Don't spend much time or effort
> making the software pretty. **The most important aspects of the
> project are the use of the agile software development concepts and the
> coding principles presented in the course.**
>
> Your team must make a presentation and demonstrate the code it has
> created on each of the days shown in the schedule (at the end of the
> syllabus). You and your fellow team members must contribute equally to
> the project and the presentations. Your presentation must demonstrate
> working software, as well as explain clearly what was done to produce
> it, justifying all project actions and decisions in
>
> terms that would be understandable to clients.
>
> In agile development terms, each presentation corresponds to an
> iteration/milestone. (In "real world" projects, there can be multiple
> iterations per milestone.)
>
> The first presentation must provide an initial solution for the
> project---working, correct, and valuable, although not complete. The
> second and third presentations must provide improved, more-complete\
> solutions. Explain how the code supports the most critical user
> stories.
>
> Tell us how you created it---what Agile techniques did you use.
>
> Working in an XP manner is the most likely way to succeed. (Look this
> up if you need more information.)
>
> You must record your team's presentations. The recording and any
> slides used must be submitted via Canvas. Keep the recording within
> two minutes of a ten-minute length.
>
> You must also submit working code and data---all the files needed to
> run the solution. Your code must be written in Python or Java. This
> material should be containerized with Docker, as discussed in Loubser
> and the required online tutorial. You must demonstrate your code in
> class. It should be tested carefully.
>
> Presentations should run no more than 17 minutes (8-12 minutes
> software demo and explanation, plus 5 minutes questions and\
> answers).Penalties will apply for significant deviations (+/-) from
> the 17-minute limit.
>
> Each student will receive the grade assigned to her/his team. Team
> grades will depend on the use of the concepts and techniques in the
> course, the quality of the software developed, and the quality of the
> presentations made.
>
> The instructor will include peer evaluations in determining
> presentation grades. The instructor will explain the peer evaluation
> rating form(s) and procedures before the first presentation.
>
> No individual submissions will be allowed. Team members must share the
> work involved equally and must strive to resolve any issues related to
> unequal participation, should these arise. The instructor reserves the
> right to remove uncooperative team members from teams and assign them
> grades indicative of non-performance.
>
> The project is to create software for "Gila Breath Camp," a summer
> camp for kids, located in a remote, scenic part of the US. [The
> software]{.ul} [must support the work of the camp's registration
> clerk]{.ul}. Do not bother to add a lot of other things, even if they
> sound cool. Just provide what the Camp Director says she needs.
>
> Gila Breath Camp has a variety of staff roles, including the Director,
> a senior wrangler and two assistants, a rope instructor, a nurse, two
> hiking leaders, a rifle/archery instructor, three cooks, a passel of
> maintenance/cleaning workers, a song leader, and a registration clerk.
> Each registration clerk is a member of the Director's family. He/she
> is friendly and dependable, but not sophisticated in the use of
> computer applications.
>
> For now, the **[only]{.ul}** purpose of the software is to support the
> work of the registration clerk:
>
> •Handling documents
>
> oapplications to camp\
> opayments\
> onotices of acceptance\
> oarrival instruction packets\
> •Processing refunds and post-acceptance issues •Dealing with "first
> day" issues
>
> ocheck-in of campers\
> oassignment of campers to bunkhouses oassignment of campers to
> "tribes"
>
> The director has chosen to defer all elaboration of the software,
> including connection to the Internet and interconnection with other
> applications. These could be in a second wave of the project but are
> not wanted now.
>
> Gila Breath Camp offers three two-week camps every summer (weeks 2-3
> in June, weeks 2-3 in July, and weeks 2-3 in August). Campers apply to
> attend any one of these each year.
>
> Applications and payments must be received two months before the start
> of camp, but no earlier than eight months before the start of camp,
> along with a check for \$1,000. Upon receipt of application and\
> clearing of the check, and verification that the prospective camper's
> age is 9-18 (inclusive), a notice of acceptance and a packet of
> arrival instructions are mailed to him/her. (The date of this mailing
> is used in
>
> determining possible refunds---see below.) Each camp has a limit of 36
> girls and 36 boys. Applications are accepted until this limit has been
> reached.
>
> Upon the arrival of a camper, the registration clerk checks him/her in
> and verifies required forms from the arrival packet (medical, legal,\
> emergency contact...) and required equipment (riding helmet, boots,
> sleeping bag, water bottle, sunscreen, bug spray...). If required
> forms are missing, the camper's parent/guardian must complete them; if
> required equipment is missing, the parent/guardian must rent/buy them
> from the camp store.
>
> Following check-in, the registration clerk assigns each camper to a
> bunkhouse and a "tribe." There are three bunkhouses for girls and
> three for boys. Each bunkhouse can accommodate twelve occupants. It is
> common for siblings and/or friends to come to camp together. These
> campers may request to be assigned to the same bunkhouse and/or tribe
> (or different ones).
>
> If a request for cancellation and refund is received, the registration
> clerk must process it. Cancellation of enrollment and refund of
> payment is allowed as follows: 90% within 3 weeks of mailing of the
> notice of acceptance and arrival instructions; 45% within 6 weeks of
> mailing; 0% after this.
>
> Assignment of campers to bunkhouses should respect requests to keep
> together (or apart) family members or friends---there is a form in the
> arrival packet for this. The assignment process should also assign
> every girl to a girls' bunkhouse and every boy to a boys' bunkhouse.1
> Other than this, the assignment process should attempt to balance the
> ages and number of campers within each bunkhouse. Each girls'
> bunkhouse should have about the same number of girls in it and should
> have about the same distribution of ages of girls in it. (Distribute
> the 18-year-olds evenly across bunkhouse, the 17-year-olds, the
> 16-yearolds, and so on.) The same kind of thing is true for boys'
> bunkhouses.
>
> Assignment of campers to "tribes" should follow similar rules\
> regarding family/friend requests, ages, and the number of campers.
> (Tribes are groups of campers who work together on various projects
> and contests during the camp.) Members of tribes don't have to be in
> the same bunkhouses; in fact, they can't be, since girls and boys are
>
> 1 The regulations of the state in which the camp is located interpret
> gender strictly in terms of sex designated at birth. This may not be
> how the Director would like to operate, but it's what the state
> expects.
>
> assigned to every tribe. Assignment should keep the ratio of girls to
> boys about the same across tribes.
>
> The system should support the clerk in doing her/his work, but it
> should also provide basic reporting for the clerk and the Director:
>
> •Info about applications, payments, acceptances, refunds, etc. •Info
> about "first day" activities
>
> Such information can be provided in tabular or graphic form.
>
> There is no Internet or cell phone service at the camp's location. (It
> is in the mountains about 100 miles from anywhere.) [The software for
> this project will be implemented on a stand-alone, single-workstation
> system]{.ul}. (This could be a Windows, MacBook, or Linux
> machine---whichever one will best support the system.) Neither
> multi-user nor network capabilities are required.
>
> The software must be correct. Full testing is expected and should be
> explained during the presentation. (Better projects for COMP350 will
> employ test-driven development as this idea is introduced into the
> course, as well as automated testing, pair programming, and other
> ideas. It is encouraged to make changes during the project to reflect
> new practices covered.)
>
> Non-technical aspects of the software (the parameters having to do
> with campers, cabins, etc.) must be maintainable by the Director or
> her designee. It should have one interface for operation and another
> for maintenance. Both should be demonstrated during the\
> presentation.
>
> Consider the instructor to be your client for project purposes,
> including answering questions not answered by this document. For
> purposes of the project, treat the instructor as you would treat an
> actual client--- make an appointment to discuss your work on the
> project, including questions about requirements.
>
> Last Revision: January 24, 2022
