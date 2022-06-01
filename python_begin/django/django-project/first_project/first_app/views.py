# from urllib import response
from django.http import Http404, HttpResponse
from django.shortcuts import render, get_object_or_404
# from django.template import loader

from .models import Question

# Create your views here.
#______________________________________________________________________________________
# def index(request):
#     # return HttpResponse("Че-то впервые создал")
#     lates_question_list = Question.objects.order_by('-pub_date')[:5]
#     # output = ', '.join([q.question_text for q in lates_question_list])
#     template = loader.get_template('first_app/index.html')
#     context = {
#         'latest_question_list': lates_question_list
#     }

#     return HttpResponse(template.render(context, request))
#______________________________________________________________________________________
def index(request):
    latest_question_list = Question.objects.order_by('-pub_date')[:5]
    context = {'latest_question_list': latest_question_list}
    return render(request, 'first_app/index.html', context)
#______________________________________________________________________________________
# def detail(request, question_id):
#     return HttpResponse("You're looking at question %s." %question_id)

# def detail(request, question_id):
#     try:
#         question = Question.objects.get(pk=question_id)
#     except Question.DoesNotExist:
#         raise Http404("Question does not exits")
#     return render (request, 'first_app/detail.html', {'question' :question} )

def detail(request, question_id):
    question = get_object_or_404(Question, pk=question_id)
    return render(request, 'first_app/detail.html', {'question': question})
#______________________________________________________________________________________

def results(request, question_id):
    response = "You're looking at the results if questions %s."
    return HttpResponse(response % question_id)

def vote(request, question_id):
    return HttpResponse("You're voiting on questios %s." % question_id) 