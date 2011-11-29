get('/') {
    renderer.render('index.html', [now: new Date()])
}

