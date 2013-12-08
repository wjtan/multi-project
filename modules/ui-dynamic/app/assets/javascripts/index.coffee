$ ->
  $.ajax
    url: "/rest/message"
    dataType: "json"
    success: (data) ->
      $("#msg").text(data)
    error: (jqXHR, textStatus, error) ->
      $("#msg").text("Error: " + JSON.parse(jqXHR.responseText).error)

